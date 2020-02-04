package 클래스;

public class 계산기 {
	// 하나의 이름으로 여러가지 처리를 할 수 있는 메소드를 여러개 반들 수 있는 기능
	// 오버로딩, 다형성
	// 입력값의 타입, 개수, 순서에 따라 구분
	
	
	public void add() {
		System.out.println("더하기 기능을 수행함");
	} // 입력값x, 반환값x
	public int add(int x, int y) {
		return x + y;
	}
	public double add(double x, int y) {
		return x + y; 
	}
	public double add(double x, double y) {
		return x + y; 
	}
	public String add(String x, String y) {
		return x + y;
	}
	public String add(String x, int y) {
		return x + y;		
	}

	
}
