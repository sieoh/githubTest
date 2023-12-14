package javabook2.CH05.array;

import java.util.Scanner;

public class AdvancedFor_travel {

	public static void main(String[] args) {
		
		for(String str:args) {
			System.out.println(str);
		}
		
		
		
		String[] travelAreas = new String[10];
		
		// 배열에 입력 전
		for(String area:travelAreas) {
			System.out.println(area);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("떠나고 싶은 여행지 입력: ");
		String travelArea = sc.nextLine();
//		System.out.println(travelArea);
		
		travelAreas[2]=travelArea;
		
		
		// 배열에 입력 후
		System.out.println("========================");
		for(String area:travelAreas) {
			System.out.println(area);
		}
		
		sc.close();

	}

}
