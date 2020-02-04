package 배열응용;

import java.util.Scanner;

public class 입력값위치찾기 {
	
	public static void main(String[] args) {
		int[] num = {66, 33, 22, 11, 99};
		Scanner sc = new Scanner(System.in);
		
		for (int j = 0; j < num.length; j++) {
			System.out.print("입력값 : ");
			int input = sc.nextInt();

			for (int i = 0; i < num.length; i++) {
				if (num[i] == input) {
					System.out.println("위치는 " + (i + 1) + "번째 입니다.");
				}
			}
		}		
	}

}
