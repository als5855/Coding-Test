package codingtext.week05;

import java.util.Arrays;

//퀵 정렬
public class EX0508 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5, 9, 8, 0, 6};
        quicksort(arr, 0, arr.length - 1);
    }
    
    static void swap(int a[], int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    static void quicksort(int a[], int l, int r) {
        int pl = l;
        int pr = r;
        int pivot = a[(l + r) / 2]; // 피벗 값을 중간 요소로 설정

        do {
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            
            if(pl <= pr) {
                swap(a, pl++, pr--);
            }
            
            System.out.println(Arrays.toString(a));
            
        } while(pl <= pr);
        
        if(l < pr) quicksort(a, l, pr);
        if(pl < r) quicksort(a, pl, r);
        
        System.out.println(Arrays.toString(a));
    }
}
