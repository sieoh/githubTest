package javabook2.ch04.sec_if;

public class ElseIf {

	public static void main(String[] args) {
		
		// 전체 if 문
		if(false) {
			// if 조건식이 참일때 실행될 소스코드		- 1
			System.out.println("if문 조건식이 참");
		} else if(true) {
			// else if 조건식이 참일때 실행될 소스코드	- 2
			System.out.println("else if문 조건식 참");
		} else {
			// if 문과 else if 문이 모두 거짓일때 실행될 소스코드  - 3
			System.out.println("if문과 else if문이 모두 거짓");
		}
		
		
		
	}

}
