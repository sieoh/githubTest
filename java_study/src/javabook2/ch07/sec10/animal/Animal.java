package javabook2.ch07.sec10.animal;

public abstract class Animal {
//	특징: 추상메서드 선언시, 중괄호 없음. => 자식 클래스의 메서드에서 책임전가
//	추상메서드는 추상클래스 내 선언
	abstract void sound();		// 소린내다
	abstract void jump();		// 점프하다
}
