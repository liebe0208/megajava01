package db;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class 네이버회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame	f = new JFrame("나의 네이버 회원가입");
		f.getContentPane().setBackground(new Color(50, 205, 50));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\hspark\\my15\\naver.png"));
		lblNewLabel.setBounds(130, 27, 230, 45);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(57, 103, 88, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 24));
		lblPw.setBounds(57, 146, 88, 35);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("굴림", Font.PLAIN, 24));
		lblName.setBounds(57, 190, 88, 35);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblTel.setBounds(57, 233, 88, 35);
		f.getContentPane().add(lblTel);
		
		t1 = new JTextField();
		t1.setBounds(179, 103, 209, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(179, 146, 209, 35);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(179, 190, 209, 35);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(179, 233, 209, 35);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("회원가입완료");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				// 입력한 값 가지고 와야함
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				// DB 처리 4단계
				try {
					// 각 기능에 각각의 부품이 존재함
					// 1. 커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터 설정 성공...");
					
					// 2. DB 연결
					String url = "jdbc:mysql://localhost:3309/shoes?useUnicode=true&characterEncoding=utf8"; // jdbc:mysql://ip
					// jdbc - java db connect
					String user = "root";
					String password = "1234";
					
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB 연결 성공...");
					
					// 3. SQL문을 만든다.
					String sql = "insert into member values (?, ?, ?, ?)";
					//String sql = "delete from member where id = ?";
					// URL url = new URL("http://www.naver.com");
					PreparedStatement ps = con.prepareStatement(sql); // url 처럼 sql로 인식하게끔 해줌
					ps.setString(1, id); // 맵핑, 1번 물음표에 id를 넣어라
					ps.setString(2, pw);
					ps.setString(3, name);
					ps.setString(4, tel); // 물음표 갯수와 같은 갯수의 setString 필요
					
					System.out.println("3. SQL문 만들기 성공...");
					
					// 4. SQL문을 mySQL프로그램에 전송
					ps.executeUpdate(); // sql문 보내기
					System.out.println("4. SQL문 전송 성공...");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(119, 301, 252, 45);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("회원탈퇴처리");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				// 입력한 값 가지고 와야함
				String id = t1.getText();
				
				// DB 처리 4단계
				try {
					// 각 기능에 각각의 부품이 존재함
					// 1. 커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터 설정 성공...");
					
					// 2. DB 연결
					String url = "jdbc:mysql://localhost:3309/shoes?useUnicode=true&characterEncoding=utf8"; // jdbc:mysql://ip
					// jdbc - java db connect
					String user = "root";
					String password = "1234";
					
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB 연결 성공...");
					
					// 3. SQL문을 만든다.
					String sql = "delete from member where id = ?";
					PreparedStatement ps = con.prepareStatement(sql); // url 처럼 sql로 인식하게끔 해줌
					ps.setString(1, id); // 맵핑, 1번 물음표에 id를 넣어라
					
					System.out.println("3. SQL문 만들기 성공...");
					
					// 4. SQL문을 mySQL프로그램에 전송
					ps.executeUpdate(); // sql문 보내기
					System.out.println("4. SQL문 전송 성공...");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setBackground(Color.RED);
		button.setFont(new Font("굴림", Font.PLAIN, 30));
		button.setBounds(119, 360, 252, 45);
		f.getContentPane().add(button);
		f.setVisible(true);

	}
}
