package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		Bank father = new Bank();
		father.name = "홍길동";
		father.account = "튼튼적금";
		father.money = 1000;
		//System.out.println(father.name);
		
		System.out.println(father);
		// println(변수)일때 변수 앞에 자동으로 to string 이라는 메소드를 호출하게 되어있음
		// 필요없는 주소값 말고 변수 값들 나타내고 싶어 -> class 파일에 가서 generate to string
		
		
		
		
		Bank mother = new Bank();
		mother.name = "박길동";
		mother.account = "튼튼예금";
		mother.money = 2000;
		System.out.println(mother);
		
		Bank girl = new Bank();
		girl.name = "홍기사";
		girl.account = "다음적금";
		girl.money = 3000;
		System.out.println(girl);


	}

}
