package 반복문;

import java.io.File;
import java.util.Scanner;

public class 게임하기 {

	public static void main(String[] args) {
		// 반복문(~동안)
		Scanner sc = new Scanner(System.in);
		
		
		while (true) { // 무한루프, true 일때 계속 반복함
			System.out.println("안녕히 가세요.");
			System.out.print("계속(0), 종료(1) >> ");
			
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("시스템을 종료합니다.");
				
				break; // while 에 break를 건다.
			}
		}

	}

}
