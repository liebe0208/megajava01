package 제어;

import javax.swing.JOptionPane;

public class 기본입력 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름은 ");
		System.out.println("당신이 입력한 이름은 " + name); // 결합연산자

		// 자동 주석 : 드레그 + 컨트롤 + /
		
		// 1) 입력 - 당신의 소속은? 메가		
		String in = JOptionPane.showInputDialog("당신의 소속은?");

		// 2) 처리 - (메가 + 스터디) 해서 임의의 변수에 저장		
		String academy = in + "스터디";
		
		// 3) 출력 - 2번의 변수 내용을 콘솔에 출력
		System.out.println("당신은 " + academy + " 소속이군요.");
		
	}
}
