package javabook2.ch02;

public class Promotion {

	public static void main(String[] args) {
		// 자동형변환(Promotion)	= 묵시적형변환
		byte byteVal = 3;
		System.out.println(byteVal);
		//큰타입 = 작은타입
		int intVal = byteVal;		// int <= byte
		System.out.println(intVal);
		
		
		// 강제형변환(Casting)		= 명시적형변환
		int intVal1 = 44032;
		System.out.println(intVal1);
		// 작은타입 = 큰타입
		char CharVal = (char)intVal1;		//char <= int
		System.out.println(CharVal);
		
		short shortVal = (short)intVal1;		//short <= int
		System.out.println(shortVal);
		

	}

}
