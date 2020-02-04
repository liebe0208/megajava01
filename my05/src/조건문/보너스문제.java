package 조건문;

import java.util.Scanner;

public class 보너스문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 직급은? >> ");
		String data = sc.next(); //사원
		
		switch (data) {
		case "사원":
			System.out.println("보너스 1000만원");
			break;
		case "과장":
			System.out.println("보너스 2000만원");
			break;
		case "사장":
			System.out.println("보너스 3000만원");
			break;
		case "회장":
			System.out.println("보너스 4000만원");
			break;

		default:
			// 위 조건이 아닐때 처리 내용
			// 생략 가능
			System.out.println("직급을 잘못 입력했습니다.");
			break;
		}
		
	} //main end
} //class end
