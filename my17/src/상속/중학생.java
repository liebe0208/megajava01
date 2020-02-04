package 상속;

public class 중학생 extends 학생 {
	@Override // 재정의
	// @ : at , '표시'라는 뜻 , 확인의 의미, 지워도 됨, 상속과 관련된 표시
	public void 배우다() {
		System.out.println("영어단어를 외우다");
	}

}
