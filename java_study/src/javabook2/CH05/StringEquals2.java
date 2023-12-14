package javabook2.CH05;

public class StringEquals2 {

	public static void main(String[] args) {
		String name1 = "홍길동";			
		String name2 = "임꺽정";			// 힙영역에 저장
		String name3 = "임꺽정";			// 힙영역에 기존 내용을 사용
		
		// new 타입(값);
		String name4 = new String("임꺽정");	// 힙영역에 새로 객체 생성
		
		if(name2==name3) {
			System.out.println("name2와 name3의 주소값이 같다.");
		} else {
			System.out.println("name2와 name3의 주소값이 같지 않다.");
		}
		
		if(name3==name4) {
			System.out.println("name3와 name4의 주소값이 같다.");
		} else {
			System.out.println("name3와 name4의 주소값이 같지 않다.");
		}
	}

}
