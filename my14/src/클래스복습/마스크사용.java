package 클래스복습;

public class 마스크사용 {

	public static void main(String[] args) {
		// 마스크를 사용하고 싶으면 마스크 틀을 복사해서 사용해라.
		
		// 클래스를 복사해올 때 1) 같은 패키지 내에서  먼저 찾아, 2) 4000개 중에 찾아, 3) 외부에 있는 거 찾아
		// import가 안 생기는 이유 => 같은 패키지 내에 있기 때문에
		마스크 m1 = new 마스크();
		m1.color = "흰색";
		m1.price = 1000;
		
		마스크 m2 = new 마스크();
		m2.color = "검정색";
		m2.price = 2000;
		
		
		
		
		System.out.println(m1);
		System.out.println(m2);
		// => 주소값 찍힘
		// 마스크.java 에 가서 generate toString => string 으로 리턴해

	}

}
