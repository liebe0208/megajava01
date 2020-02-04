package 클래스;

public class 커피전문점 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		// cal.add(2000, 3800); // 결과값이 return 되어있음. 변수에 저장
		// void 형 메소드일 경우 변수에 저장할 수 없음.
		// return 이 있는 것만 변수에 저장 가능
		int result = cal.add(2000, 3800);
		cal.minus(result);

		int result2 = cal.multi(3000, 4);
		cal.div(result2);

	}

}
