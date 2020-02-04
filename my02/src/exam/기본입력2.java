package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		
		// 두 개를 입력 받아서
		String text = JOptionPane.showInputDialog("오늘의 요일은?");
		String date = JOptionPane.showInputDialog("오늘 날짜는?");
		
		//System.out.println("오늘은 " + date + "이고," + text + "입니다.");
		
		String month = JOptionPane.showInputDialog("오늘은 몇 월인가요?");
		String day = JOptionPane.showInputDialog("오늘은 며칠인가요?");
		
		// 두 개를 결합시켜
		String date02 = month + " " + day;
		
		// 그 결합 결과를 출력
		//System.out.println("오늘 날짜는 " + date02 + "입니다.");
		//JOptionPane.showMessageDialog(null, date02);
		
		FileWriter file = new FileWriter("win.txt"); // 에러 위에 커서 두고 f2 누르면 에러 해결 방법이 나옴
		file.write(date02);
		file.close();

	}

}
