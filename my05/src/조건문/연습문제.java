package 조건문;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		
		System.out.println("당신의 직급은 ?");
		
		Scanner sc = new Scanner(System.in);
		String level = sc.next();
		
		switch (level) {
			case "사원":
				System.out.println(level + "의 보너스는 1000만원입니다."); break;
			case "과장":
				System.out.println(level + "의 보너스는 2000만원입니다."); break;
			case "사장":
				System.out.println(level + "의 보너스는 3000만원입니다."); break;
			case "회장":
				System.out.println(level + "의 보너스는 4000만원입니다."); break;
		}
		
	} //main end
} //class end
