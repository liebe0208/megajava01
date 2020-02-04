package 조건문;

import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		
		// 첫 번째 문제
		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("-----------------------");
		
		int garo = 7;
		int sero = 8;
		
		int m = garo * sero;
		
		if (m >= 50) {
			System.out.println("너무 넓군요.");
		} else {
			System.out.println("너무 좁군요.");
		}
		
		// 두 번째 문제
		String one = "짜장면";
		String two = "짬뽕";
		String three = "우동";
		
		System.out.println("----------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("----------------");
		System.out.println("1) 짜장면, 2) 짬뽕, 3) 우동");
		System.out.println("----------------");
		System.out.print("당신의 선택은 ? ");
		
		Scanner sc = new Scanner(System.in);
		int food = sc.nextInt();
		
		if (food == 1) {
			System.out.println("당신은 " + one + "를 주문하셨습니다." );
		}else if (food == 2) {
			System.out.println("당신은 " + two + "를 주문하셨습니다." );
		} else {
			System.out.println("당신은 " + three + "를 주문하셨습니다." );
		}
		
		
	} //main end
} //class end
