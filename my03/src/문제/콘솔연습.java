package 문제;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		
		System.out.println("나에 대한 정보");
		System.out.println("----------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 >> ");
		String name = sc.next();
		
		System.out.println("나이 입력 >> ");
		String age = sc.next();
		
		System.out.println("취미 입력 >> ");
		String hobby = sc.next();
		
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 취미는 " + hobby);
		
		
	}

}

