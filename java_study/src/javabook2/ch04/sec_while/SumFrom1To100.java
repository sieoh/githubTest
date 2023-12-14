package javabook2.ch04.sec_while;

public class SumFrom1To100 {

	public static void main(String[] args) {
		// 문제: 1부터 100까지 합 구하기(while 문 사용)
		int i=0;
		int sum=0;
		while(i<200) {
			i++;
			sum+=i;
			if(i==100) {
				break;
			}
		}
		System.out.println("합: ");
		System.out.println(sum);
	}

}
