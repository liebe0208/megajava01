package 스태틱;

public class Tv사용 {

	public static void main(String[] args) {
		Tv t1 = new Tv("검정", 100);
		// System.out.println(t1.count);
		System.out.println(Tv.count);
		Tv t2 = new Tv("빨강", 50);
		System.out.println(t2.count);
		// t1, t2 모두 각각 변수가 세 개 복사됨
		// dynamic 하다
		
		System.out.println(t1);
		System.out.println(t2);
		
		
		

	}

}
