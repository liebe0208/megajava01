package db;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConnect4 {

	public static void main(String[] args) {
		try {
			// 각 기능에 각각의 부품이 존재함
			// 1. 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 성공...");
			
			// 2. DB 연결
			String url = "jdbc:mysql://localhost:3309/shoes"; // jdbc:mysql://ip
			// jdbc - java db connect
			String user = "root";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB 연결 성공...");
			
			// String id = JOptionPane.showInputDialog("id 입력");
			String id = JOptionPane.showInputDialog("id 입력");
			String pw = JOptionPane.showInputDialog("pw 입력");
			String name = JOptionPane.showInputDialog("name 입력");
			String tel = JOptionPane.showInputDialog("tel 입력");
			
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

}
