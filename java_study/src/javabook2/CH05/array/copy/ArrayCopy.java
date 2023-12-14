package javabook2.CH05.array.copy;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] oldInArr = {1,2,3};			// 값 목록으로 배열 생성
		int[] newInArr = new int[5];		// new 연산자 배열 생성
		 
		for(int i=0;i<newInArr.length;i++) {
			System.out.println(newInArr[i]+"  ");
		}
		System.out.println();
		
		// ArrayCopy(이전 배열, 위치, 새 배열, 위치, 복사 길이)
		System.arraycopy(oldInArr, 0, newInArr, 0, oldInArr.length);
		
		for(int i=0;i<newInArr.length;i++) {
			System.out.println(newInArr[i]+"  ");
		}
		
		
	}

}
