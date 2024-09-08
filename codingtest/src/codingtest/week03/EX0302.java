package codingtest.week03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열로 큐만들기
 */

public class EX0302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayQueue queue = new ArrayQueue(5);
		
		while(true) {
//			System.out.println(String.format("현재 수 : %d / %d",  args));
			System.out.println("1.add 2.poll 3.peek 4.clear 5.print 0.exit");
			int num = sc.nextInt();
			if(num == 0) {
				System.exit(0);
				break;
			}
			int x;
			switch(num) {
			case 1:
				x = sc.nextInt();
				int result = queue.add(x);
				System.out.println(result);
				break;
			case 2:
				result = queue.poll();
				System.out.println(result);
				break;
			case 3:
				result = queue.peek();
				System.out.println(result);
				break;
			case 4:+
				queue.clear();
				break;
			case 5:
				queue.print();
				break;
			case 0:
				
				break;
			default:
				break;
			}
		}
	}
	
	static class ArrayQueue{// 큐관련 클래스
		private int max; //최대 요량(capacity)
		private int front; //첫번째 요쇼 커서
		private int rear; //마지막 요소 커서
		private int cnt; //데이터의 수 
		private int queue[];//큐
		
		
		public ArrayQueue(int capacity) {
			this.max = capacity;
			this.front = this.rear = this.cnt = 0;
			this.queue = new int[this.max];
			Arrays.fill(queue, -9999);
		} 
		public int add(int x) {
			if(cnt >= max) {
				System.out.println("Queue is Full!!!");
				return -1;
			}
			queue[rear++] = x;
			cnt++;
			if(rear == max) rear = 0;
			return x;
		}
		public int poll() {
			if(cnt <= 0) {
				System.out.println("Queue is Empty!!");
				return -1;
			}
			
			int x = queue[front++];
			cnt--;
			if(cnt < 0) cnt = 0;
			if(front == max) front = 0;
			return x;
		}
		public int peek() {
			if(cnt <= 0) {
				System.out.println("Queue is Empty!!");
				return -1;
			}
			int x = queue[front];
			return x;
		}
		
		public int capacity() {
			return this.max;
		}
		public int size() {
			return this.cnt;
		}
		
		public boolean isEmpty() {
			return cnt <= 0;
		}
		
		public boolean isFull() {
			return cnt >= max;
		}
		
		public void clear() {
			this.front = this.rear = this.cnt = 0;
		}
		
		public void print() {
			if(cnt <= 0) {
				System.out.println("Queue is Empty!!!");
				
			} else {
				System.out.println(queue.toString());
				System.out.println(Arrays.toString(queue));
			}
		}
		
	}
}
