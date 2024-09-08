package codingtest.week03;

import java.util.StringTokenizer;

public class Ex0304 {
	public static void main(String[] args) {
		String s = "Hello,world,Hello,Java";
		
//		StringTokenizer st = new StirngTokenizer(s);
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println(st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken ());
		}
}
}
