package codingtest.week02;

import java.util.ArrayList;
import java.util.List;

public class Ex0200 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("월");
		list.add("월");
		list.add("화");
		list.add("수");
		list.add("목");
		list.add("금");
		list.add("토");
		System.out.println(list.toString());
		
		list.set(0, "일");
		System.out.println(list.toString());
		
		System.out.println(list.contains("가"));
		System.out.println(list.contains("금"));
		System.out.println(list.get(4));
		System.out.println(list.isEmpty());
		System.out.println(list.size( ));
		
		list.remove(0);
		System.out.println(list.toString());
		list.remove("토");
		System.out.println(list.toString());
		list.clear();
		System.out.println(list.toString());
	}
}
