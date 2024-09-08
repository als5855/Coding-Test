package codingtext.week05;

import java.util.Arrays;
import java.util.Scanner;

public class EX0504 {
	public static void main(String[] args) {
		int arr[] = {5, 7, 11, 15, 18, 4, 29, 31, 95, 70, 68, 56};
		//정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = Arrays.binarySearch(arr, n);
		if(idx == -1) {
			System.out.println("존재하지 않는 수");
		} else {
			System.out.println(String.format("%d수는 arr[%d]에 존재", n, idx));
		}
	}
}
