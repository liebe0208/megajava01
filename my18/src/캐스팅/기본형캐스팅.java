package 캐스팅;

public class 기본형캐스팅 {

	public static void main(String[] args) {
		byte a = 100; // 1바이트 (int 의 1/4)
		int b = 120; // 4바이트
		b = a; // 큰 <- 작 : 큰것으로 자동 변환해서 들어간다
				// int <- byte 자동으로 형변환 된다 (자동형변환)
		// 형변환 = 캐스팅(casting)
		
		a = (byte)b; // 작 <- 큰(에러) : 작은 것으로 강제 변환해서 들어가야 함
				// byte <- int (강제형변환)

	}

}
