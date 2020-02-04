package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 500); // . 연산자 => 접근연산자(~에)
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(30, 99, 111, 47);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("나이");
		label.setFont(new Font("굴림", Font.PLAIN, 40));
		label.setBounds(30, 183, 111, 47);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("굴림", Font.PLAIN, 40));
		label_1.setBounds(30, 275, 111, 47);
		f.getContentPane().add(label_1);
		
		name = new JTextField();
		name.setFont(new Font("굴림", Font.PLAIN, 40));
		name.setBounds(153, 99, 148, 47);
		f.getContentPane().add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("굴림", Font.PLAIN, 40));
		age.setColumns(10);
		age.setBounds(153, 183, 148, 47);
		f.getContentPane().add(age);
		
		shoe = new JTextField();
		shoe.setFont(new Font("굴림", Font.PLAIN, 40));
		shoe.setColumns(10);
		shoe.setBounds(153, 275, 148, 47);
		f.getContentPane().add(shoe);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = name.getText();
				if(n.equals("") || n.equals("다시 입력")) { 
					// 스트링은 기본 테이터가 아니라 == 쓸 수 없음
					// 스트링은 클래스라서 부품이 있음
					name.setText("다시 입력");
				} else {
					System.out.println("이름 출력 : " + n + "님");
				}
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setBounds(317, 99, 127, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				// 내년 나이를 구해서 나이 출력 아래에 넣어보세요.
				int a2 = Integer.parseInt(a);
				int next = a2 + 1;
				System.out.println("나이 출력 : " + a + "세");				
				System.out.println("내년 나이는 : " + next + "세");				
			}
		});
		button.setBackground(Color.CYAN);
		button.setFont(new Font("굴림", Font.PLAIN, 40));
		button.setBounds(317, 183, 127, 47);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				System.out.println("신발 사이즈 출력 : " + s + "mm");
			}
		});
		button_1.setBackground(Color.CYAN);
		button_1.setFont(new Font("굴림", Font.PLAIN, 40));
		button_1.setBounds(317, 275, 127, 47);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("모두 출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String a = age.getText();
				String s = shoe.getText();
				System.out.println("이름 출력 : " + n + "님");
				System.out.println("나이 출력 : " + a + "세");
				System.out.println("신발 사이즈 출력 : " + s + "mm");
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(Color.BLUE);
		button_2.setFont(new Font("굴림", Font.PLAIN, 40));
		button_2.setBounds(129, 375, 220, 47);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("2차");
		lblNewLabel_1.setBounds(169, 34, 104, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
		f.setVisible(true);

	}
}
