package 조건문;

public class 성적처리2 {

	public static void main(String[] args) {
		// 점수가 88점 이라고 해봅시다.
		int jumsu = 88;
		
		if (jumsu >= 90) {
			System.out.println("A학점");
			
		}else if (jumsu >= 80){ // if 옆에는 항상 소괄호가 오게 하고, 조건을 꼭 써줘야한다.
			System.out.println("B학점");
		}else if (jumsu >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		} //else

	} //main end
} //class end
