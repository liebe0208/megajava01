package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나3 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int computer = r.nextInt(3); // -21억 ~ 21억
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0) 가위, 1) 바위, 3) 보 >> ");
		int me = sc.nextInt();
		
		switch (me) {
		case 0: // 내가 가위
			// 컴퓨터가 무엇을 냈느냐에 따라 달라짐
			switch (computer) {
			case 0:
				System.out.println("컴퓨터는 가위를 냄");
				System.out.println("비김");
				break;
			case 1:
				System.out.println("컴퓨터는 바위를 냄");
				System.out.println("컴퓨터가 승");
				break;
			default:
				System.out.println("컴퓨터는 보를 냄");
				System.out.println("내가 승");
				break;
			}
			
			break;
		case 1: // 내가 바위를 냄
			switch (computer) {
			case 0:
				System.out.println("컴퓨터는 가위를 냄");
				System.out.println("컴퓨터가 승");
				break;
			case 1:
				System.out.println("컴퓨터는 바위를 냄");
				System.out.println("비김");
				break;
			default:
				System.out.println("컴퓨터는 보를 냄");
				System.out.println("내가 패");
				break;
			}
			
			break;

		default: // 나는 보를 냄
			switch (computer) {
			case 0:
				System.out.println("컴퓨터는 가위를 냄");
				System.out.println("컴퓨터가 승");
				break;
			case 1:
				System.out.println("컴퓨터는 바위를 냄");
				System.out.println("내가 승");
				break;
			default:
				System.out.println("컴퓨터는 보를 냄");
				System.out.println("비김");
				break;
			}

			break;
		}

		System.out.println("computer : " + computer);
		
		
	}

}
