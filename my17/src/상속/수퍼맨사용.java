package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		//수퍼맨 super = new 수퍼맨(); // super 는 boolean 등과 같이 문법적인 의미가 있기 때문에 쓸수 없음
		
		수퍼맨 수퍼 = new 수퍼맨();
		수퍼.gender = "남"; // 사람
		수퍼.name = "클라크"; // 사람
		수퍼.power = 100; // 맨
		
		System.out.println(수퍼); // 주소값이 나와야 하지만 수퍼맨 클래스에 추가한 toString 으로 리턴된 값이 나옴
		
		수퍼.잠자다(); // 사람
		수퍼.먹다(); // 사람
		수퍼.달리다(); // 맨
		수퍼.날아다니다(); // 수퍼맨

	}

}
