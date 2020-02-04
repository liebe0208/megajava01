package 상속;

import java.util.TimerTask;

public class Timer작동 extends TimerTask {
	
	

	@Override
	public void run() { // 끝났을 때 이 메소드가 자동으로 호출되도록 만들어져있음
		System.out.println("게임이 종료되었습니다.");
		System.out.println("안녕히 가세요.");

	}

}
