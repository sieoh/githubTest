package javabook2.CH05.array;

public class ArrayInArray3 {

	public static void main(String[] args) {
		// 문제: 다차원 배열을 선언하세요
		
		String[] book = {"이것은 자바다","오라클 SQL","HTML&CSS"};	// 1차원 배열 선언
		
		String[][] books = {										// 2차원 배열 선언
				{"이것은 자바다","오라클 SQL","HTML5&CSS"},
				{"java","SQL","HTML"},
				{"한빛","길벗","한빛"}
		};
		
		// 1차원 배열 선언하시오 (new 연산자 사용)
		
		String[] book1 = new String[3];
		book1[0] = "이것은 자바다";
		book1[1] = "오라클 SQL";
		book1[2] = "HTML5&CSS";
		
		
		// 2차원 배열에 할당된 데이터를 출력하시오 (for 문 사용)
		
		String[][] books2 = {										
				{"이것은 자바다","오라클 SQL","HTML5&CSS"},
				{"java","SQL","HTML"},
				{"한빛","길벗","한빛"}
		};
		
		for(int j=0;j<books2.length;j++) {
			for(int i=0;i<books2[j].length;i++) {
				System.out.println(books2[j][i]);
			}
		}
		
	}

}
