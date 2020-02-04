package 클래스;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		int result = cal.add(200, 100);
		System.out.println(result);
		System.out.println(cal.add(200, 100)); // 한줄에 세미콜론은 한번만 나와야함
		// System.out.println(cal.add());
		// void 타입의 메소드를 호출한 경우에는 반환값이 없으므로 변수에 값을 넣을 수도 없고
		// 프린트할 수도 없음.
		
		double result2 = cal.add(15.5, 5);
		System.out.println(result2);
		
		double result3 = cal.add(20.5, 11.1);
		System.out.println(result3);
		
		String result4 = cal.add("감자", "개");
		System.out.println(result4);
		
		String result5 = cal.add("감자", 5);
		System.out.println(result5);
		

	}

}
