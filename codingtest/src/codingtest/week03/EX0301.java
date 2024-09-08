package codingtest.week03;

import java.util.LinkedList;
import java.util.Queue;

public class EX0301 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.offer(2);//주어진 객체를 넣는다.
		queue.offer(3);
		queue.offer(4);
		
		System.out.println(queue.toString());
		System.out.println(queue.size());

		System.out.println(queue.peek());//: 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다.
		System.out.println(queue.toString());
		
		System.out.println(queue.poll());//: 객체 하나를 가져온다. 객체를 큐에서 제거한다.
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty());
	}
}
