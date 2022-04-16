package student;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Random;
import javax.sound.sampled.Clip;

public class record_voice {

	public record_voice(int filename) {
		try {
			
			
			AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2 ,4,44100, false);
			DataLine.Info dataInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
			if(!AudioSystem.isLineSupported(dataInfo)) {
				System.out.println("Not Supported");
			}
			TargetDataLine targetLine = (TargetDataLine) AudioSystem.getLine(dataInfo);
			
			targetLine.open();
			targetLine.start();
			
			Thread audioRecorderThread = new Thread()
			{
				@Override public void run()
				{
					AudioInputStream recordingStream = new AudioInputStream(targetLine);
					File outputFile = new File(filename + "_record.wav");
					
					try {
						AudioSystem.write(recordingStream, AudioFileFormat.Type.WAVE, outputFile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.print(e);
					}
					
				}
			};
			audioRecorderThread.start();
			JOptionPane.showMessageDialog(null, "Press Okay to Stop Recording","Recording", JOptionPane.YES_OPTION);
			targetLine.stop();
			targetLine.close();
		}
		catch(Exception z) {
			System.out.println(z);
		}
	}
}
