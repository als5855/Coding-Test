package codingtext.week05;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 이진 검색
 * */
public class EX0503 {
	public static void main(String[] args) {
		int arr[] = {5, 7, 11, 15, 18, 4, 29, 31, 95, 70, 68, 56};
		//정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = BinSearch.binSearch(arr, n);
		if(idx == -1) {
			System.out.println("존재하지 않는 수");
		} else {
			System.out.println(String.format("%d수는 arr[%d]에 존재", n, idx));
		}
	}
}

class BinSearch{
	static int binSearch(int[] a, int key) {
		int pl = 0;
		int pr = a.length -1;
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) return pc;
			else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
		} while(pl <= pr);
		
		return -1;
	}
}