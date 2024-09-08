package codingtext.week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EX0509 {
	public static void main(String[] args) {
		int arr[] = {1, 6, 2, 4, 9, 3};
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(3);
		
		//배열 정렬
		Arrays.sort(arr);//오름차순
		System.out.println(Arrays.toString(arr));
		
		//Collection 정렬
		Collections.sort(list);//오름차순
		Collections.sort(list, Collections.reverseOrder()); //내림차순
	}
}
