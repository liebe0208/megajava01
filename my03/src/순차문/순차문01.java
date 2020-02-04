package 순차문;

import javax.swing.JOptionPane;

public class 순차문01 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 1. 입력 : 오늘의 날씨는?
		String data = JOptionPane.showInputDialog("오늘의 날씨는?");
		
		// 2. 처리 : 비 => 비가 오는 날에는 우산을 챙겨요
		String result = data + "가 오는 날에는 우산을 챙겨요";
		
		// 3. 출력
		//System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		
		//연습
		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요.");
		String company = JOptionPane.showInputDialog("당신의 소속을 입력해주세요.");
		
		String result02 = name + "은 " + company + "소속입니다.";
		
		JOptionPane.showMessageDialog(null, name + "은 " + company + "소속입니다.");
		JOptionPane.showMessageDialog(null, result02);
		

	}

}
