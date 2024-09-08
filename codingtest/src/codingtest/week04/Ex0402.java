package codingtest.week04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayStack stack = new ArrayStack(n);
        while(true) {
            System.out.print("1.push 2.pop 3.peek 4.clear 5.print 0.exit : ");
            int num = sc.nextInt();
            if(num == 0) break; // 0을 누르면 바로 끝난다.
            int x;
            switch(num) {
                case 1: 
                    int m = sc.nextInt();
                    x = stack.push(m);
                    System.out.println(x);
                    break;
                case 2 :
                    x = stack.pop();
                    System.out.println(x);
                    break;
                case 3 :
                    x = stack.peek();
                    System.out.println(x);
                    break;
                case 4 :
                    stack.clear();
                    break;
                case 5 :
                    stack.print();
                    break;
                default:
                    break;
            }
        }
    }
}

class ArrayStack {
    private int top;
    private int capacity;
    private int stack[];

    public ArrayStack(int n) {
        this.top = -1;
        this.capacity = n;
        stack = new int[n];
    }

    public int push(int x) {
        if(isFull()) {
            System.out.println("Stack is Full!!");
            return -1;
        } else {
            stack[++top] = x;
            return x;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            int x = stack[top];
            stack[top--] = 0;
            return x;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    public void clear() {
        this.top = -1;
        this.stack = new int[this.capacity];
    }

    public boolean isFull() {
        return this.top >= this.capacity - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }
    
    public int size() {
        return this.top + 1;
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!!");
        } else {
            System.out.println(Arrays.toString(stack));
        }
    }
}
