package codingtest.week02;

public class Telvision implements RemoteControl {
	private int volume;//지역변수

	@Override//상속받은 인터페이스,클래스의 메소드 재사용
	public void turnOn() {//구현을 한다.
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume//매게변수) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME; 
	} else if(volume < RemoteControl.MIN_VOLUME) {
		this.volume = RemoteControl.MAX_VOLUME;
	}else this.volume = volume;
}
