package javabook2.ch07.sec06.other;
import javabook2.ch07.sec06.A;

public class B  extends A {
	// 생성자
	public B() {
		// 1. 상속을 통한 필드와 메서드 사용 가능
		super();				// 생성자 호출 가능
		this.field1 = "A필드";	// 필드 사용 가능
		this.method1l();		// 메서드 사용 가능
	}
	// 메서드
	public void method2() {
		this.field1 = "A필드";	// 필드 사용 가능
		this.method1l();		// 메서드 사용 가능
		
		// 2. 직접 객체를 생성하여 사용하는 것은 불가능
		A a = new A();
		a.field1 = "A필드";
		a.method1();
	}
}
