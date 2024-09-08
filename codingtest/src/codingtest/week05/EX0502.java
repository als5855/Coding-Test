package codingtext.week05;

import java.util.Scanner;

public class EX0502 {
		public static void main(String[] args) {
			int arr[] = {6, 4, 8, 2, 3, 1};
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int idx = SquenecSearch.sequencesSearch(arr, n);
			if(idx == -1) {
				System.out.println("존재하지 않는 수");
			} else {
				System.out.println(String.format("%d수는 arr[%d]에 존재", n,idx));
			}
		}
}

class SquenecSearch{
	static int sequencesSearch(int[]a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(key == a[i]) return i;
		}
		
		return -1;
	}
}