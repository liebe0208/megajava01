package 순차문;

import java.util.Scanner;

public class 음식점 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음식점 계산 총 금액 : ");
		int price = sc.nextInt();
		
		System.out.print("함께 먹은 사람 인원수 : ");
		int man = sc.nextInt();
		
		double avg = (double)price / man;
		// 타입을 바꾸는 것 => casting(캐스팅)
		
		System.out.println("-------------------");
		System.out.print("각자 내야할 돈 : " + (int)avg + "원");
		
	}

}
