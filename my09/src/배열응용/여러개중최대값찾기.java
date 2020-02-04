package 배열응용;

import java.util.Random;

public class 여러개중최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random(7); // () 안에 숫자를 아무거나 넣으시면 항상 같은 값이 나옴
		// 42를 넣는 것을 => '씨앗(seed)값을 심는다'고 표현
		// 랜덤 값들을 동일하게 유지 기능
		int[] num = new int[10000];

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(10000); // 0~9999
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " > " + num[i]);
		}

		System.out.println("--------------------------");

		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}

		System.out.println("숫자 중 최대값은 " + max);

		int count = 0;
		// 최대값이 들어있는 자리를 찾으면 됨
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				System.out.println(max + " 값이 들어있는 위치는 " + i);
				count++;
			}
		}
		System.out.println(max + " 값이 위치한 개수는 " + count + "개");

	}

}
