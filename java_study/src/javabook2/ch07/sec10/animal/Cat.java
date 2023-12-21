package javabook2.ch07.sec10.animal;

public class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
	@Override
	void jump() {
		System.out.println("더 높이 점프한다");
	}
}
