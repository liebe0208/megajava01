package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {
	private static JTextField t2;
	private static JTextField result;
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(477, 424);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\hspark\\my07\\cal.png"));
		lblNewLabel.setBounds(153, 25, 139, 85);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(66, 137, 57, 24);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자2");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(66, 183, 57, 24);
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setForeground(SystemColor.activeCaption);
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(153, 173, 139, 37);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. t1과 t2의 입력값을 가지고 온다.
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				// 2. t1과 t2의 타입을 계산해주기 위해서 int로 변환
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				// 3. 두 수를 더한다.
				int t = t111 + t222;
				
				// 4. 더한 결과를 result에 넣어준다.
				//    결과값 : 300
				result.setText(t + "");
			}
		});
		btnNewButton.setBounds(46, 243, 82, 37);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("빼 기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 - t222;
				result.setText("결과값 : " + t);
			}
		});
		button.setBounds(140, 243, 82, 37);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				Double t111 = Double.parseDouble(t11);
				Double t222 = Double.parseDouble(t22);
				
				Double t = t111 * t222;
				String s = String.valueOf(t);
				result.setText(s);
			}
		});
		button_1.setBounds(234, 243, 82, 37);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				int t = t111 / t222;
				String s = String.valueOf(t);
				result.setText(s);
			}
		});
		button_2.setBounds(327, 243, 82, 37);
		f.getContentPane().add(button_2);
		
		result = new JTextField();
		result.setBounds(210, 303, 182, 37);
		f.getContentPane().add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("결과화면 :");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(49, 302, 149, 26);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setForeground(SystemColor.activeCaption);
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setColumns(10);
		t1.setBounds(153, 127, 139, 37);
		f.getContentPane().add(t1);
		
		
		
		f.setVisible(true);

	}
}
