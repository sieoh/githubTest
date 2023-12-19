package javabook2.ch06.sec10;

import javabook2.ch06.sec08.Calculator;

// 주민센터 실행 클래스
public class Community {

	public static void main(String[] args) {
		
		Korean kim = new Korean("870913-1234567");	// kim 씨 탄생
		System.out.println("국적: "+kim.nation);
		
		
//		kim.nation = "영국";
		
		System.out.println(kim.ssn);
//		kim.ssn = "870913-1234567";	// 재할당 불가
		
		javabook2.ch06.sec10.Korean lee = new javabook2.ch06.sec10.Korean("870914-1234567");
	      
        javabook2.ch06.sec08.Calculator myCal = new javabook2.ch06.sec08.Calculator();
        myCal.powerOn();
        myCal.powerOff();
	
		
	}

}
