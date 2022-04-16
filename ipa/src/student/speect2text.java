package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.swing.JOptionPane;

import com.microsoft.*;

import com.microsoft.cognitiveservices.speech.CancellationDetails;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.PronunciationAssessmentConfig;
import com.microsoft.cognitiveservices.speech.PronunciationAssessmentGradingSystem;
import com.microsoft.cognitiveservices.speech.PronunciationAssessmentGranularity;
import com.microsoft.cognitiveservices.speech.PronunciationAssessmentResult;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.ResultReason;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionResult;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioInputStream;
import com.microsoft.cognitiveservices.speech.audio.AudioStreamFormat;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;

public class speect2text {
	public static String accuracy,pronoun,completeness,fluency;
	public static void main (String [] args) throws ExecutionException, InterruptedException, IOException
	{
	}
    // Pronunciation assessment with events from a push stream
    // This sample takes and existing file and reads it by chunk into a local buffer and then pushes the
    // buffer into an PushAudioStream for pronunciation assessment.
    // Pronunciation assessment.
	 // Pronunciation assessment with events from a push stream
    // This sample takes and existing file and reads it by chunk into a local buffer and then pushes the
    // buffer into an PushAudioStream for pronunciation assessment.
	static Semaphore stopRecognitionSemaphore; 
    public  speect2text(String filename) throws InterruptedException, IOException
    {
        // Creates an instance of a speech config with specified
        // subscription key and service region. Replace with your own subscription key
        // and service region (e.g., "westus").
        SpeechConfig config = SpeechConfig.fromSubscription("2a94726a6745413582b9853b634cc7c5", "southeastasia");

        // Set pronunciation assessment language
        config.setSpeechRecognitionLanguage("en-US");

        // Set audio format
        long samplesPerSecond = 44100;
        short bitsPerSample = 16;
        short channels = 2;

        // Whether to simulate the real time recording (need be set to true when measuring latency with streaming)
        boolean simulateRealtimeRecording = false;

        // Create the push stream to push audio to.
        PushAudioInputStream pushStream = AudioInputStream.createPushStream(AudioStreamFormat.getWaveFormatPCM(samplesPerSecond, bitsPerSample, channels));

        // Creates a speech recognizer using Push Stream as audio input.
        AudioConfig audioInput = AudioConfig.fromStreamInput(pushStream);

        SpeechRecognizer recognizer = new SpeechRecognizer(config, audioInput);

        stopRecognitionSemaphore = new Semaphore(0);

        final long[] lastAudioUploadedTime = new long[1];
        recognizer.recognized.addEventListener((s, e) -> {
            if (e.getResult().getReason() == ResultReason.RecognizedSpeech) {
                System.out.println("RECOGNIZED: Text=" + e.getResult().getText());
                PronunciationAssessmentResult pronunciationResult = PronunciationAssessmentResult.fromResult(e.getResult());
                System.out.println(
                        String.format(
                                "    Accuracy score: %f, Pronunciation score: %f, Completeness score : %f, FluencyScore: %f",
                                pronunciationResult.getAccuracyScore(), pronunciationResult.getPronunciationScore(),
                                pronunciationResult.getCompletenessScore(), pronunciationResult.getFluencyScore()));
                accuracy = pronunciationResult.getAccuracyScore().toString();
                pronoun = pronunciationResult.getPronunciationScore().toString();
                completeness = pronunciationResult.getCompletenessScore().toString();
                fluency = pronunciationResult.getFluencyScore().toString();
                long resultReceivedTime = System.currentTimeMillis();
                System.out.println(String.format("Latency: %d ms", resultReceivedTime - lastAudioUploadedTime[0]));
            }
            else if (e.getResult().getReason() == ResultReason.NoMatch) {
                System.out.println("NOMATCH: Speech could not be recognized.");
            }
            stopRecognitionSemaphore.release();
        });

        recognizer.canceled.addEventListener((s, e) -> {
            System.out.println("CANCELED: Reason=" + e.getReason());

            if (e.getReason() == CancellationReason.Error) {
                System.out.println("CANCELED: ErrorCode=" + e.getErrorCode());
                System.out.println("CANCELED: ErrorDetails=" + e.getErrorDetails());
                System.out.println("CANCELED: Did you update the subscription info?");
            }

            stopRecognitionSemaphore.release();
        });

        recognizer.sessionStarted.addEventListener((s, e) -> {
            System.out.println("\n    Session started event.");
        });

        recognizer.sessionStopped.addEventListener((s, e) -> {
            System.out.println("\n    Session stopped event.");
        });

        String referenceText = "phonetics";
        // create pronunciation assessment config, set grading system, granularity and if enable miscue based on your requirement.
        PronunciationAssessmentConfig pronunciationConfig = new PronunciationAssessmentConfig(referenceText,
                PronunciationAssessmentGradingSystem.HundredMark, PronunciationAssessmentGranularity.Phoneme, true);
        pronunciationConfig.applyTo(recognizer);

        System.out.println("Assessing...");
        recognizer.recognizeOnceAsync();

        // Replace with your own audio file name.
        // The input stream the sample will read from.
        InputStream inputStream = new FileInputStream(filename);

        // Arbitrary buffer size.
        byte[] readBuffer = new byte[4096];

        // Push audio read from the file into the PushStream.
        // The audio can be pushed into the stream before, after, or during recognition
        // and recognition will continue as data becomes available.
        int bytesRead;
        while ((bytesRead = inputStream.read(readBuffer)) != -1) {
            if (bytesRead == readBuffer.length) {
                pushStream.write(readBuffer);
            } else {
                // Last buffer read from the WAV file is likely to have less bytes
                pushStream.write(Arrays.copyOfRange(readBuffer, 0, bytesRead));
            }

            if (simulateRealtimeRecording)
            {
                // Sleep corresponding time for the uploaded audio chunk, to simulate the natural speaking rate.
                Thread.sleep(bytesRead * 1000 / (bitsPerSample / 8) / samplesPerSecond / channels );
            }
        }

        inputStream.close();
        // Signal the end of stream to stop assessment
        pushStream.close();

        lastAudioUploadedTime[0] = System.currentTimeMillis();

        stopRecognitionSemaphore.acquire();
        Thread.sleep(2000);
        config.close();
        audioInput.close();
        recognizer.close();
    }
}    