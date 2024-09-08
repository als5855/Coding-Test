package codingtext.week05;
//선택정렬
import java.util.Arrays;

public class Ex0506 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 7, 5, 9, 8, 0, 6}; 
		selectionSort(arr);
	}
	
	static void swap(int a[], int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	static void selectionSort(int a[]) {
		for(int i = 0; i < a.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < a.length; j++) {//최소값을 구하기
				if(a[j] < a[min]) min = j;
			}
			swap(a, i, min);
			System.out.println(Arrays.toString(a));
		}
	}
}
