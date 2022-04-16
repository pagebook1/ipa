package student;
import com.microsoft.cognitiveservices.speech.*;
import com.microsoft.cognitiveservices.speech.audio.*;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

	public class text2speech {
		
	    private static String YourSubscriptionKey = "2a94726a6745413582b9853b634cc7c5";
	    private static String YourServiceRegion = "southeastasia";

	    public static void main(String[] args) throws InterruptedException, ExecutionException {
	        
	    }
	    public text2speech(String text) throws InterruptedException, ExecutionException {
	    	SpeechConfig speechConfig = SpeechConfig.fromSubscription(YourSubscriptionKey, YourServiceRegion);

	        speechConfig.setSpeechSynthesisVoiceName("en-US-JennyNeural"); 

	        SpeechSynthesizer speechSynthesizer = new SpeechSynthesizer(speechConfig);

	        // Get text from the console and synthesize to the default speaker.
	        if (text.isEmpty())
	        {
	            return;
	        }

	        SpeechSynthesisResult speechRecognitionResult = speechSynthesizer.SpeakTextAsync(text).get();

	        if (speechRecognitionResult.getReason() == ResultReason.SynthesizingAudioCompleted) {
	            System.out.println("Speech synthesized to speaker for text [" + text + "]");
	        }
	        else if (speechRecognitionResult.getReason() == ResultReason.Canceled) {
	            SpeechSynthesisCancellationDetails cancellation = SpeechSynthesisCancellationDetails.fromResult(speechRecognitionResult);
	            System.out.println("CANCELED: Reason=" + cancellation.getReason());

	            if (cancellation.getReason() == CancellationReason.Error) {
	                System.out.println("CANCELED: ErrorCode=" + cancellation.getErrorCode());
	                System.out.println("CANCELED: ErrorDetails=" + cancellation.getErrorDetails());
	                System.out.println("CANCELED: Did you set the speech resource key and region values?");
	            }
	        }
	    	
	    }
	}
