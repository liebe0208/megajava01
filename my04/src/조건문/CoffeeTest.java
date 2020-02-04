package 조건문;

public class CoffeeTest { // camel 표기법 (낙타표기법), 자바는 카멜 표기법을 권장
	// Coffee_test
	// snake 표기법 (뱀 표기법)
	// 파이썬에서 권장하는 표기법

	public static void main(String[] args) {
		
		int price = 5600;
		int count = 5;
		
		// 25000원이 넘으면 할인 쿠폰 5000원짜리
		// 아니면 그냥 다 계산
		
		int sum = price * count ;
		
		if (sum >= 25000) {
			
			sum = sum - 5000;
			
		} else {
			// 비워둬도 됨
		}
		
		System.out.println("당신이 지불할 금액은 " + sum + "원");
		
		
		int hour = 21;
		
		if (hour < 22) {
			System.out.println("열심히 공부합시다.");
		} else {
			System.out.println("집에 갈 시간이 거의 다 되었어요.");
		}

	}

}
