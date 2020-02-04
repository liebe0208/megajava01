package 순차문;

import java.util.Scanner;

public class travel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< 여행 정보 >>");
		System.out.println("-----------------");
		
		System.out.print("- 여행지 : ");
		String area = sc.next();
		
		System.out.print("- 경비 : ");
		int money = sc.nextInt();
		
		System.out.print("- 할인율 : ");
		double sale = sc.nextDouble();
		
		System.out.print("- 실제 경비 : ");
		double result = money - money * sale ;
		// 자바에서는 연산할 때 하나라도 실수가 있으면 결과가 무조건 실수!
		// 정수와 정수의 연산의 결과는 무조건 정수!
		
		System.out.println((int)result + "원"); // 실수 result 를 정수로 바꾸고 싶을 때 () 안에 바꾸고자 하는 타입 입력
		System.out.println("-----------------");
		System.out.println("=> 12월 중순에 갔을 때 가격");
		
		

	}

}
