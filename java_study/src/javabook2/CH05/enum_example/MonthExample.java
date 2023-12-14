package javabook2.CH05.enum_example;

import java.util.Scanner;

public class MonthExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("월을 숫자로 입력하세요: ");
		int month = sc.nextInt();
		
		switch(month) {
			case 11:
				System.out.println("11월: DB");
				break;
			case 12:
				System.out.println("12월: JAVA");
				break;
			case 1:
				System.out.println("1월: HTML");
				break;
			case 2:
				System.out.println("2월: JSP");
				break;
			case 3:
				System.out.println("3월: 스마트 팩토리");
				break;
			case 4:
				System.out.println("4월: SPRING");
				break;
		}
		
		sc. close();
		
		// 문제: 해당 월에 해야할 과정을 스케쥴링하고 출력하는 프로그램을 작성하시오
		// 11월: DB
		// 12월: java
		// 1월: html
		// 2월: jsp
		// 3월: 스마트팩토리
		// 4월: spring
		
		Month today = Month.DEC;
		
		switch(today) {
			case NOV:
				System.out.println("11월: DB");
				break;
			case DEC:
				System.out.println("12월: JAVA");
				break;
			case JAN:
				System.out.println("1월: HTML");
				break;
			case FEB:
				System.out.println("2월: JSP");
				break;
			case MAR:
				System.out.println("3월: 스마트 팩토리");
				break;
			case APR:
				System.out.println("4월: SPRING");
				break;
		}
		
	}

}
