package javabook2.ch07.sec10;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone myPhone = new Phone("홍길동");
		
//		System.out.println("소유자: "+myPhone.owner);
//		myPhone.trunOn();
//		myPhone.trunOff();
		
		SmartPhone broPhone = new SmartPhone("홍길상");
		System.out.println("소유자: "+broPhone.owner);
		broPhone.trunOn();
		broPhone.trunOff();
		broPhone.music = "뉴진스-하입보이";
		broPhone.listenMusic(broPhone.music);
	}

}
