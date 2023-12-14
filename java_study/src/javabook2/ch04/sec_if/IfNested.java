package javabook2.ch04.sec_if;

public class IfNested {

	public static void main(String[] args) {
		
		int num = 1;
		
		if(num == 1) {						//true
			int num1 = 3;
			System.out.println("1");	
			if(num == 2) {					//false
				System.out.println("2");	
			} else if(num == 3) {			//false
				System.out.println("3");	
			}
			System.out.println("num : " + num);
			System.out.println("num : " + num1);
		} else {
			System.out.println("num rn: " + num);
		}
		

	}

}
