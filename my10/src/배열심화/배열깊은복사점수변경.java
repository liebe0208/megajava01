package 배열심화;

public class 배열깊은복사점수변경 {

	public static void main(String[] args) {
		int[] term1 = {100, 88, 96};
		int[] term2 = term1.clone();
		
		term2[0] = 99;
		
		System.out.println(term1);
		System.out.println(term2);
		
		System.out.print("1학기 점수 : ");
		for (int a : term1) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("2학기 점수 : ");
		for (int b : term2) {
			System.out.print(b + " ");
		}

	}

}
