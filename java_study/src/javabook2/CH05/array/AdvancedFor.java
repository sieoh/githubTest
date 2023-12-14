package javabook2.CH05.array;

import java.util.Scanner;

public class AdvancedFor {

	public static void main(String[] args) {
		// 향상된 for 문
//		for(타입 변수:배열) {
//			실행문;
//		}
		int[] scores = {96,71,84,93,87};
		
		for(int score:scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("떠나고 싶은 여행지 입력: ");
		String travelArea = sc.nextLine();
		
		String[] travelAreas = {"제주도","부산","여수","독도","울릉도"};
				
		for(String area:travelAreas) {
			System.out.println(area);
		}
		
		sc.close();
		
	}

}
