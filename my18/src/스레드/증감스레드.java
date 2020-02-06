package 스레드;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class 증감스레드 extends JFrame {
	
	JLabel plus = new JLabel("증");
	JLabel minus = new JLabel("감");

	public 증감스레드() {
		getContentPane().setBackground(new Color(102, 204, 255));
		setSize(500, 500);
		setTitle("카운트다운");
		getContentPane().setLayout(null);
		
		plus.setForeground(Color.BLUE);
		plus.setHorizontalAlignment(SwingConstants.CENTER);
		plus.setFont(new Font("굴림", Font.BOLD, 40));
		plus.setBounds(63, 126, 160, 150);
		getContentPane().add(plus);
		
		minus.setForeground(Color.RED);
		minus.setHorizontalAlignment(SwingConstants.CENTER);
		minus.setFont(new Font("굴림", Font.BOLD, 40));
		minus.setBounds(257, 126, 160, 150);
		getContentPane().add(minus);
		
		PlusThread p = new PlusThread();
		p.start();
		MinusThread m = new MinusThread();
		m.start();
		
		setVisible(true);
	}
	
	class PlusThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				plus.setText(i + "");
			}
		}
	}
	
	class MinusThread extends Thread{
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				minus.setText(i + "");
			}
		}
	}

	public static void main(String[] args) {
		증감스레드 count = new 증감스레드();

	}
}
