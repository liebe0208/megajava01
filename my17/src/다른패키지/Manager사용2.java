package 다른패키지;

import 상속.Manager;

public class Manager사용2 {

	public static void main(String[] args) {
		Manager m2 = new Manager(); // 다른 패키지에 있기 때문에 ctrl + space로  매니저 찾아야함. (import 시켜줌)
		m2.name = "김길동";
	}

}
