package javabook2.ch07.sec10.animal;

public class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	@Override
	void jump() {
		System.out.println("높이 점프한다");
	}
}
