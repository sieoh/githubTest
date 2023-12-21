package javabook2.ch08.sec01;
// 구현 클래스
public class Televsion implements RemoteControl {
	// 필드
	int Volume;
	// 생성자
	// 메서드
	@Override
	public void trunOn() {
		System.out.println("tv 켜다");
	}
	@Override
	public void trunOff() {
		System.out.println("tv 끄다");
	}
	@Override
	public void setVolume(int Volume) {
//		만약, 리모콘 최대볼륨이 MAX_VOLUME 보다 크면,
//			볼륨은 MAX_VOLUME 값으로 설정하고,
//		그리고 리모콘 최소볼륨이 MIN_VOLUME보다 작으면,
//			볼륨을 MIN_VOLUME 값으로 설정하고,
//		그렇지 않으면, 설정하고 싶은 볼륨을 입력하라
		
		if(Volume>MAX_VOLUME) {
			this.Volume=MAX_VOLUME;
		} else if(Volume<MIN_VOLUME) {
			this.Volume=MIN_VOLUME;
		} else {
			this.Volume=Volume;
		}
		
		System.out.println("현재 tv 볼륨: "+this.Volume);
		
	}
	
	
}
