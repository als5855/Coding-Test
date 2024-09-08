package codingtext.week05;

import java.util.Arrays;

/*
 * 삽입정렬 
 */
public class EX0507 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 7, 5, 9, 8, 0, 6}; 
		insertSort(arr);
	}
	
	static void insertSort(int a[]) {
		for(int i = 1; i < a.length; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
			
			System.out.println(Arrays.toString(a));
			
		}
	}
}
