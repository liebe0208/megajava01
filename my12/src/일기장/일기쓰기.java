package 일기장;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;

	public void diary() { // 메인을 메소드로 바꿔줌 => 로그인과 연결하기 위해 메소드로 만들어줌
		JFrame f = new JFrame();
		f.setTitle("일기 쓰기 창");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(251, 38, 181, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(251, 87, 181, 35);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setRows(5);
		t3.setFont(new Font("Monospaced", Font.PLAIN, 30));
		t3.setColumns(20);
		t3.setBounds(251, 156, 181, 179);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(27, 38, 160, 35);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("오늘의 제목");
		label.setFont(new Font("굴림", Font.PLAIN, 30));
		label.setBounds(27, 87, 160, 35);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("오늘의 내용");
		label_1.setFont(new Font("굴림", Font.PLAIN, 30));
		label_1.setBounds(27, 156, 160, 35);
		f.getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\hspark\\my12\\일기장2.jpg"));
		lblNewLabel_1.setBounds(27, 218, 212, 117);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("오늘의 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가지고 오기
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				// 2. 파일에 저장하기
				FileWriter f;
				try {
					f = new FileWriter(day + ".txt");
					f.write(title + "\n");
					f.write(content + "\n");
					f.close();
					JOptionPane.showMessageDialog(null, "저장완료!! 내일 또 만나요.");
				} catch (IOException e1) {
					System.out.println("파일 저장 중 에러가 생김");
				}
				// 3. 확인 메시지 뿌리기
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(27, 387, 405, 43);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);

	}
}
