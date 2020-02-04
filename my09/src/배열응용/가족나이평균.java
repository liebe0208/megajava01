package 배열응용;

import javax.swing.JOptionPane;

public class 가족나이평균 {

	public static void main(String[] args) {
		int sum = 0;
		
		String[] age = new String[4];
		for (int i = 0; i < age.length; i++) {
			age[i] = JOptionPane.showInputDialog("가족의 나이는 >> ");
			
			sum = sum + Integer.parseInt(age[i]);
			
		}
		
		System.out.println("우리 가족 나이의 평균은 " + sum/age.length + " ");
		
	}

}
