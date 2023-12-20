package javabook2.ch07.sec08.car;
// 금호 타이어 클래스: 자식
public class kumgoTire extends Tire {
	@Override
	public void roll() {
		System.out.println("금호타이어가 회전하다");
	}
}
