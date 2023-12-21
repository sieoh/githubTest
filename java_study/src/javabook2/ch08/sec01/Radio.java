package javabook2.ch08.sec01;

public class Radio implements RemoteControl {
	int Volume;
	
	@Override
	public void trunOn() {
		System.out.println("라디오를 켜다");
	}

	@Override
	public void trunOff() {
		System.out.println("라디오를 끄다");
	}

	@Override
	public void setVolume(int Volume) {
		if(Volume>MAX_VOLUME) {
			this.Volume=MAX_VOLUME;
		} else if(Volume<MIN_VOLUME) {
			this.Volume=MIN_VOLUME;
		} else {
			this.Volume=Volume;
		}
		System.out.println("현재 라디오 볼륨: "+this.Volume);
	}

}
