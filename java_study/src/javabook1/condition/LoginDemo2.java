package javabook1.condition;

import java.util.Scanner;

public class LoginDemo2 {

	public static void main(String[] args) {
		//문제 : Sacnner를 사용하여 아이디를 입력받아
		//		로그인을 수행하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		// close 사이에 입력 받는 소스 코드 작성

		System.out.print("아이디를 입력하세요 : ");
		
		String id = sc.nextLine();
		System.out.println("입력된 아이디는 : "+ id);
		
		sc.close();
		
		String DB_id = "siyeon";
		
//		System.out.println(id.equals(id));
		
		if(DB_id.equals(id)) {
			System.out.println(id + "으로 로그인 되었습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다. 다시 입력해 주세요.");
		}
		
		
		
		
		
	}

}
