package javabook2.ch04.sec_doshile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do-while 문
//		## 메시지 입력 프로그램
//		1. 메세지를 입력하세요
//		2. 키보드로 메세지를 입력
//		3. q 키를 입력하여 프로그램을 종료
		Scanner sc = new Scanner(System.in);		// 입력 준비
		String inputStr;
		do {
			System.out.println("메세지를 입력하세요");
			inputStr=sc.nextLine();					// 입력(문자열) 수행
			System.out.println(inputStr);
		} while(!inputStr.equals("q"));
		sc.close();									// 입력 종료
		
	}

}
