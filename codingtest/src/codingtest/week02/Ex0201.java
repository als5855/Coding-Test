package codingtest.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex0201 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 100; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 100; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + "ns");
	
	}
}
