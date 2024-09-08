package codingtest.week04;

import java.util.Scanner;
import java.util.Stack;

public class BJ1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		int top = 0;
		while(n > 0) {
			int m = sc.nextInt();
			if(m > top) {
				for(int i = top + 1; i <= m; i++) {
					stack.push(i);
					System.out.println("+");
				}
				top = m;
			}
			if(stack.peek() != m) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			System.out.println("-");
			n--;
		}
	}
}
