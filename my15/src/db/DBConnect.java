package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {

	public static void main(String[] args) throws Exception {
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
		
		// 3. SQL문을 만든다.
		String sql = "insert into member values ('winter', 'winter', 'winter', 'winter')";
		String sql2 = "insert into member values ('summer', 'summer', 'summer', 'summer')";
		// URL url = new URL("http://www.naver.com");
		PreparedStatement ps = con.prepareStatement(sql); // url 처럼 sql로 인식하게끔 해줌, 굳이 new 로 만들지 않아도 return 해줌
		PreparedStatement ps2 = con.prepareStatement(sql2);
		System.out.println("3. SQL문 만들기 성공...");
		
		// 4. SQL문을 mySQL프로그램에 전송
		ps.executeUpdate(); // sql문 보내기
		ps2.executeUpdate();
		System.out.println("4. SQL문 전송 성공...");
		
	}

}
