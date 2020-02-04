package 순차문;

import javax.swing.JOptionPane;

public class 순차문03 {

	public static void main(String[] args) {
		
		String data1 = JOptionPane.showInputDialog("첫 번째 수");
		String data2 = JOptionPane.showInputDialog("두 번째 수");
		
		int n1 = Integer.parseInt(data1);
		int n2 = Integer.parseInt(data2);
		
		// 처리
		int result = n1 + n2;
		
		// 출력
		System.out.println(n1 + "+" + n2 + "=" + (n1 + n2) + "입니다.");
		System.out.println(n1 + "+" + n2 + "=" + result +"입니다.");
		
	} //main end.

} //class end.
