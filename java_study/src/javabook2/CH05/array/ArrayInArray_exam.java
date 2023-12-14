package javabook2.CH05.array;

public class ArrayInArray_exam {

	public static void main(String[] args) {
		// 평가 예제: 
		// 반별 학생들의 점수 생성 및 합계와 평균 구하기
		// 2차원 배열
		
		int[][] scores = {
			{80,90,96},				// 1반 3명
			{76,88}					// 2반 2명
		};
		// 1반 2번째 학생 점수
		System.out.println(scores[0][1]);
		// 2반 1번째 학생 점수
		System.out.println(scores[1][0]);
		
		System.out.println(scores.length);		// 1차원 배열 길이
		System.out.println(scores[0].length);	// 2차원 0번인덱스 배열길이(1반 학생수)
		System.out.println(scores[1].length);	// 2차원 1번인덱스 배열길이(2반 학생수)
		
		System.out.println("=======================");
		// 1반 학생들 점수 모두 출력(for)
		for(int i=0;i<scores[0].length;i++) {
			System.out.println("1반 학생 "+(i+1)+"의 점수: "+scores[0][i]);
		}
		for(int i=0;i<scores[1].length;i++) {
			System.out.println("2반 학생 "+(i+1)+"의 점수: "+scores[0][i]);
		}
		System.out.println("=======================");
		for(int j=0;j<scores.length;j++) {
			for(int i=0;i<scores[j].length;i++) {
				System.out.println(j+1+"반 학생 "+(i+1)+"의 점수: "+scores[j][i]);
			}
		}
		
		System.out.println("=======================");
		// 문제 1: 1반 학생들 점수 총합
		// 1반
		int sum = 0;
		for(int i=0;i<scores[0].length;i++) {
			sum += scores[0][i];
		}
		System.out.println("1반 점수 총합: "+sum+"점");
		// 2반
		sum=0;
		for(int i=0;i<scores[1].length;i++) {
			sum += scores[1][i];
		}
		System.out.println("2반 점수 총합: "+sum+"점");
		
		System.out.println("=======================");
		// 문제 2: 2반 학생들 점수 평균
		// 1반
		sum=0;
		for(int i=0;i<scores[0].length;i++) {
			sum += scores[0][i];
		}
		double avg2 = (double)sum / scores[0].length;
		System.out.println("1반 평균: "+avg2+"점");
		// 2반
		sum=0;
		for(int i=0;i<scores[1].length;i++) {
			sum += scores[1][i];
		}
		double avg = (double)sum / scores[1].length;
		System.out.println("2반 평균: "+avg+"점");
		
		System.out.println("=======================");
		// 문제 3: 전체 학생들 점수 총합
		sum=0;
		int count=0;
		for(int j=0;j<scores.length;j++) {				// 2번 반복
			for(int i=0;i<scores[j].length;i++) {		// 3번 반복
//				System.out.println(scores[j][i]);
				sum+=scores[j][i];						// 6명 성적 더하기
				count++;
			}
		}
		System.out.println("모든 학생 총점: "+sum+"점");
		double avg3 = (double)sum / count;
		System.out.println("모든 학생 평균: "+avg3+"점");
	}

}
