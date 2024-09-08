package codingtest.week02;

public interface RemoteControl {
	//상수선언
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {}
		else {}
		
	//정적 메소드
	static void changeChannel() {
		
	}
}
