package 조건문;

import java.util.Date;

public class 요일처리2 {

	public static void main(String[] args) {

		Date date = new Date();
		int day = date.getDay();
		
		if (day == 0) {
			System.out.println("일요일");
		} else if (day == 1) {
			System.out.println("월요일");
		} else if (day == 2) {
			System.out.println("화요일");
		} else if (day == 3) {
			System.out.println("수요일");
		} else if (day == 4) {
			System.out.println("목요일");
		} else if (day == 5) {
			System.out.println("금요일");
		} else {
			System.out.println("토요일");
		}
	} //main end
} //class end
