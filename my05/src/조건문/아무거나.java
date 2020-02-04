package 조건문;

import java.util.Random;

public class 아무거나 {

	public static void main(String[] args) {
		// 아무거나 내게 하는 class -> 랜덤 (Random)
		
		Random r = new Random();
		int computer = r.nextInt(3); // -21억 ~ 21억
		System.out.println("computer : " + computer);
		
//		if (computer == 0) {
//			System.out.println("컴퓨터는 가위를 냄");
//		} else if (computer == 1) {
//			System.out.println("컴퓨터는 바위를 냄");
//		} else {
//			System.out.println("컴퓨터는 보를 냄");
//		}
		
		switch (computer) {
		case 0:
			System.out.println("컴퓨터는 가위를 냄");
			break;
		case 1:
			System.out.println("컴퓨터는 바위를 냄");
			break;
		case 2:
			System.out.println("컴퓨터는 보를 냄");
			break;

		default:
			break;
		}

	}

}