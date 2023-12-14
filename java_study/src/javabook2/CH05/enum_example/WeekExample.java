package javabook2.CH05.enum_example;

public class WeekExample {

	public static void main(String[] args) {
		// 열거(enum)타입
		// 타입 변수명
		int num;
		num = 30;
		
		Week today = null;
		today = Week.WEDNEDAY;
		Week yesterday;
		yesterday = Week.TUESDAY;
		
		Week tomorrow;
		tomorrow=Week.THURSDAY;
		
		switch(tomorrow) {
		case MONDAY:
			System.out.println("월: 등원합니다");
			break;
		case TUESDAY:
			System.out.println("화: 등원합니다");
			break;
		case WEDNEDAY:
			System.out.println("수: 등원합니다");
			break;
		case THURSDAY:
			System.out.println("목: 등원합니다");
			break;
		case FRIDAY:
			System.out.println("금: 등원합니다");
			break;
		case SATURDAY:
			System.out.println("토: 집에서 공부합니다");
			break;
		case SUNDAY:
			System.out.println("일: 쉽니다");
			break;
		}
	}

}
