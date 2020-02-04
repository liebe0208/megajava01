package 클래스;

public class 계산기 {

	// 없음 = void
	// return 할 경우 타입을 넣어줌 void => int

	public int add(int coffee, int green) {
		System.out.println("결제금액 : " + (coffee + green));
		return coffee + green;
	}

	public void minus(int money) {
		boolean vip = true;
		int result = money - 1000;
		System.out.println("당신의 최종 결제금액 : " + result);
	}

	public int multi(int money, int count) {
		System.out.println("총 결제금액 : " + money * count);
		return money * count;
	}

	public void div(int money, int count) {
		System.out.println("한 명당 내야하는 금액 : " + money / count);
	}

}
