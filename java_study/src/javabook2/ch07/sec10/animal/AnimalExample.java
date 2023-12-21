package javabook2.ch07.sec10.animal;

public class AnimalExample {

	public static void main(String[] args) {
		// 추상 클래스의 객체 생성 불가
		
		// 자식 클래스 객체 생성 가능
		Dog dog = new Dog();
		dog.sound();
		dog.jump();
		
		System.out.println("==================");
		Cat cat = new Cat();
		cat.sound();
		cat.jump();
		
		System.out.println("==================");
		
		animelSound(dog);
		animelSound(cat);
		
	}
	// main() 함수에서 메서드 사용시 static을 붙이는 이유
//	=> 정적 메서드에서 인스턴스 멤버를 사용 불가
//	  그렇지 않으면, 인스턴스 메서드를 사용하려면 객체를 생성해야 하는데 
//	  편의상 추가적인 코드가 필요하고 공통적으로 사용하는 메서이므로
//	  static을 붙이는 것이 좋다
	
	// 메서드 선언
//	Animal animal = dog;	// 자동형변환: 부모 메서드 사용 가능
	static void animelSound(Animal animal){
		animal.sound();
	}
	
}
