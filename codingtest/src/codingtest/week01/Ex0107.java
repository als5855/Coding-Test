package codingtest.week01;

public class Ex0107 {
	public static void main(String[] args) {
		String[] arrays = {"a", "b", "c", "d"};
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		System.out.println("----------------------");
		String str = "abcd";
		System.out.println(str.length());
			for(String arr: arrays) {
				System.out.println(arr);
			}
			System.out.println("----------------------");
			int numbers[] = {1,2,3, 4, 5, 6,7,8,9,};
			for(int i =0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			for(int number : numbers) {
				System.out.println(number);
			}

	}
}
