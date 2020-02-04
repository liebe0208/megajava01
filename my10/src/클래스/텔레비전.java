package 클래스;

public class 텔레비전 {
	// 부품의 특징을 가지고 부품을 만들어야 한다.
	// tv 성질 : 모양, 크기, 회사, 가격, 색 등
	// => 변수로 만든다 (멤버변수)
	// 동작 : 채널바꾸기, 볼륨조절, 켜다, 끄다 등
	// => 멤버메소드 (= 함수)
	
	// 변수
	String shape;
	int size;
	
	// 멤버메소드
	public void changeCh() { // changeCh 명령어 이름
		// changCh() 명령어를 쳤을 때
		// 처리하고 싶은 내용을 여기에 쭉 적으면 된다.
		System.out.println("TV 채널을 바꾸다.");
	}
	
	public void off() {
		System.out.println("TV를 끄다.");
	}
	
	

}
