package javabook2.ch06.sec10;

public class Television {
	// 필드
	static String company = "Samsung";
	static String model = "LCD";
	static int info = 1234;
	
//	시리얼 번호: samsungLCD1234
	static String serialNum = company+model+"-"+info;
	
	// 정적 필드
	static {
		serialNum = company+model+"-"+info;
	}
	
	
}
