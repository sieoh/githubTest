package javabook2.CH05.array;

public class ArrayInArray2 {

	public static void main(String[] args) {
		// 2차원 배열 생성
		// 타입[][] 변수명 = new 타입[길이][길이];
		
//		2x3개 데이터 저장 가능
		int[][] iArr1 = new int[2][3];
		
		iArr1[0][0] = 10;
		iArr1[0][1] = 20;
		iArr1[0][2] = 30;
		
		System.out.println(iArr1[0][0]);
		System.out.println(iArr1[0][1]);
		System.out.println(iArr1[0][2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(iArr1[0][i]);
		}
		
		iArr1[1][0] = 40;
		iArr1[1][1] = 50;
		iArr1[1][2] = 60;
		
		System.out.println(iArr1[1][0]);
		System.out.println(iArr1[1][1]);
		System.out.println(iArr1[1][2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(iArr1[1][i]);
		}
		
		System.out.println("======================");
		for(int j=0;j<2;j++) {
			for(int i=0;i<3;i++) {
				System.out.println(iArr1[j][i]);
			}
		}
		
		
		
	}

}
