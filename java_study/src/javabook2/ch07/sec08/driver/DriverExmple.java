package javabook2.ch07.sec08.driver;
// 실행 클래스
public class DriverExmple {

	public static void main(String[] args) {
		Driver driver;
		driver = new Driver("kenneth");
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus);
		driver.drive(texi);
		
	}

}
