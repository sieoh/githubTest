package javabook2.ch04.sec_switch;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		// 문제: 점수를 입력 받아 성적 등급을 부여하는 프로그램을 작성
		// (switch 문을 사용할 것. 등급 변수는 char 사용할 것)
		// 힌트1: Scanner 입력 사용
		// 힌트2: 점수 영역별 등급 신청(ex: 90점대, 80점대)
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수를 입력하세요.");
		score = sc.nextInt();
		System.out.println("당신의 점수는: " + score);
		
		score /= 10;
		
		sc.close();
		
		char grade;   				// 변수 선언
		
		switch(score) {
			case 10:
			case 9:
				grade = 'A';		// 변수 할당
//				System.out.println("A");
				break;
			case 8:
				grade = 'B';		// 변수 할당
//				System.out.println("B");
				break;
			case 7:
				grade = 'C';		// 변수 할당
//				System.out.println("C");
				break;
			default:
				grade = 'F';		// 변수 할당
//				System.out.println("F");
				break;
		}
		
		// 문제2: 점수에 따라 부여된 등급을 char 변수를 사용하여
		//		재수강 여부를 결정하는 Switch 문을 작성하시오.
				
		System.out.println("당신의등급은 : " + grade);		// 출력
		
		switch (grade) {
			case 'F':
				System.out.println("F등급시 재수강 함");
				break;
			default:
				System.out.println("A,B,C등급시 재수강 안함");
				break;

		}

		
	}

}
