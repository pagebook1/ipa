package discussionStudent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

import chrriis.dj.nativeswing.NativeSwing;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class embedVideo {
//	
	public embedVideo(String link) {
		NativeInterface.open();
		JPanel wbPanel = new JPanel(new BorderLayout());
		JWebBrowser wb = new JWebBrowser();
		wbPanel.add(wb,BorderLayout.CENTER);
		wb.setBarsVisible(false);
		wb.navigate(link);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.getContentPane().add(wbPanel,BorderLayout.CENTER);
				frame.setSize(720,480);
				frame.setVisible(true);
				
			}
		});
		new Thread(new Runnable() {
	        @Override
	        public void run() {
	            if (!NativeInterface.isEventPumpRunning())
	                NativeInterface.runEventPump();
	        }
	    }).start();
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				NativeInterface.close();
			}
		}));
		
		

	}
}
