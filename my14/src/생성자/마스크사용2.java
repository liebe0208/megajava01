package 생성자;

public class 마스크사용2 {

	public static void main(String[] args) {
		마스크 m1 = new 마스크("검정색", 1000); // 클래스 이름이 동일하게 생긴 애가 실행됨
		// 마스크() 생성자가 자동 실행
		// m1이라는 객체를 만들 때(생성될 때) 자동 실행된다
		// 클래스와 똑같이 생긴 메소드를 생성자 (메소드)라고 함.
		// constructor
		
		System.out.println(m1); // toString()이 자동 실행

	}

}
