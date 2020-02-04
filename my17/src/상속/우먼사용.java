package 상속;

public class 우먼사용 {

	public static void main(String[] args) {
		우먼 woman = new 우먼();
		woman.gender = "woman";
		woman.hair = 100;
		woman.name = "우먼";
		
		System.out.println(woman);
		
		woman.먹다();
		woman.섬세하다();
		woman.잠자다();

	}

}
