package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\hspark\\my12\\일기장2.jpg"));
		lblNewLabel.setBounds(22, 24, 376, 208);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(41, 268, 57, 24);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 20));
		lblPw.setBounds(41, 326, 57, 24);
		f.getContentPane().add(lblPw);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(121, 256, 249, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(121, 314, 249, 41);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				if (id.equals("root") && pw.equals("1234")) {
					// 일기쓰러감 => diary() 필요
					일기쓰기 today = new 일기쓰기();
					today.diary();
					// diary() 메소드를 쓰고 싶으면, 이 메소드를 쓸 수 있는 주소를 가진 변수만 있으면 된다.
				} else {
					// 경고메시지
					JOptionPane.showMessageDialog(null, "아이디 또는 패스워드를 잘못 입력하셨습니다.");
				}
				
			}
		});
		
		btnNewButton.setIcon(new ImageIcon("D:\\hspark\\my12\\check.png"));
		btnNewButton.setBounds(41, 394, 165, 117);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id, pw를 공백으로 초기화
				t1.setText("");
				t2.setText("");
			}
		});
		button.setIcon(new ImageIcon("D:\\hspark\\my12\\reset.png"));
		button.setBounds(218, 394, 165, 117);
		f.getContentPane().add(button);
		f.setTitle("나의 일기장");
		f.setSize(440, 583);
		f.setVisible(true);

	}
}
