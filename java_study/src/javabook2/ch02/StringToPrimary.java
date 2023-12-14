package javabook2.ch02;

public class StringToPrimary {

	public static void main(String[] args) {
		// String  => int
		String str = "10";
		int intval = Integer.parseInt(str);
		System.out.println(intval);
		
		int intval2 = intval + 10;
		System.out.println(intval2);
		
		// int intval3 = str + 10;
		
		
		// 서식 문자 활용 : printf
		int month = 12;
		System.out.printf("오늘은 %d월 입니다.\n", month);
		// pintf(), 서식문자 %d(정수) 사용
		
		double pi = 3.14;
		System.out.printf("수학기호 파이의 값은 %f 입니다.\n", pi);
		// pintf(), 서식문자 %d(실수) 사용
		
		int date = 4;
		System.out.printf("오늘은 %d월 %d일 입니다.", month, date);
		// pintf(), 서식문자 %d(정수) 여러번 사용, \n으로 행 변경
		
		

	}

}
