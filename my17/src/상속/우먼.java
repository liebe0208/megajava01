package 상속;

public class 우먼 extends 사람 {
	int hair;
	
	public void 섬세하다() {
		System.out.println("만들기에 섬세하다.");
	}

	@Override
	public String toString() {
		return "우먼 [hair=" + hair + ", gender=" + gender + ", name=" + name + "]";
	}
	
	

}
