package codingtext.week05;

import java.util.Arrays;

public class EX0505 {
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 2, 8, 9, 4, 0, 6};
		
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int a[], int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	static void bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
			if(a[i] > a[j])//오름차순
				swap(a, i, j);
		}
	}
	}
}
