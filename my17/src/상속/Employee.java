package 상속;

public class Employee {
	// 접근제어자(아래 네 가지)
	// public > protected > default > private
	public String name; // + : 아무데서나 name 이라는 변수 사용 가능
	// 기본제어자(아무것도 없는 것 / 기본값) => 같은 패키지!
	String address; // 같은 패키지 내에서만 사용 가능
					// 상속이라는 패키지 내에서만 사용 가능
	protected int salary; // # : 같은 패키지, 다른 패키지(상속) 했을 때 쓸 수 있음
	private int rrn; // 이 클래스를 벗어날 수 없음. 이 클래스 내에서만 사용 가능. 
}
