 package codingtest.week02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(8);
		
		rc = new Radio();
		rc.turnOff();
		rc.setMute(false);
	}
}
