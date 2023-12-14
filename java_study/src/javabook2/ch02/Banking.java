package javabook2.ch02;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String str;
		int bal;
		
		System.out.print("입금하시겠어요?(입금 금액을 입력) : ");
//		str = sc.nextLine();
		bal = sc.nextInt();
		
		System.out.print("잔액 : ");
		System.out.println(bal);
		
		sc.close();

	}

}
