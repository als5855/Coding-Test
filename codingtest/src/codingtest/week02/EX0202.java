package codingtest.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX0202 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		
		System.out.println(set.toString());
		set.remove("F");
		System.out.println(set.toString());
		
		for(String s : set) {
			System.out.println(s);
		}
		
		// 위와 같은 내용
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
