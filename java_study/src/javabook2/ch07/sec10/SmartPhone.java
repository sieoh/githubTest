package javabook2.ch07.sec10;
// 자식 클래스
public class SmartPhone extends Phone {
	//필드
	String music;
	//생성자
	SmartPhone(String owner){
		super(owner);
	}
	//메서드
	void listenMusic(String music) {
		System.out.println(music+"을(를) 재생하다");
	}
}
