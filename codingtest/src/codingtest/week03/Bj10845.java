package codingtest.week03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Bj10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//LinkedList 
//		LinkedList<Integer> queue = new LinkedList<>();
 //		Deque
		Deque<Integer> queue = new ArrayDeque<>();
		
		int n = sc.nextInt(); //개수
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String s =sc.nextLine();
			
			switch(s.split("")[0]) {
			case "push":
				queue.offer(Integer.parseInt(s.split(" ")[1]));
				//queue.
				break;
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.poll());
				}
				break;
			case "size": 
				System.out.println(queue.size());
			case "empty":
				if(queue.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(queue.isEmpty()) System.out.println(-1);
				else System.out.println(queue.peek());
				break;
			case "back":
				if(queue.isEmpty()) System.out.println(-1);
				else System.out.println(queue.peekLast());
				break;
			default:
					break;
			}
		}
	}
}
