package codingtest.week01;

public class Ex0109 {
	public static void main(String[] args) {
		ep: //라벨브레이크
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 70) {
					break ep;
				}
				System.out.print(i);
			}
		}
	}
}
