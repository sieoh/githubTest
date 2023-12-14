package javabook2.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// while 문 문법
//		[문제] 항상 반복되도록 만들고 싶다
		int num=0;
		while(true) {
			System.out.println(num);
//			만약, num가 10아ㅣ 되면 반복문을 빠져나오게 하고 싶다.
			if(num==10) {
				break;
			}
			num++;
		}
		
//		========================
		// for 문 문법
//		for(int i=o;i<10;i++) {
//			System.out.println(i);
//		}
		
		
//		========================
	}

}
