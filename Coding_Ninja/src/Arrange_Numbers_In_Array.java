
//Arrange_Numbers_In_Array
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrange_Numbers_In_Array {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void arrange(int[] arr, int n) {
		int left = 0;
		int right = n - 1;
		int counter = 1;
		while (left <= right) {
			if (counter % 2 == 1) {
				arr[left] = counter;
				counter += 1;
				left += 1;
			} else {
				arr[right] = counter;
				counter += 1;
				right -= 1;
			}
		}
	}

	

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());
		while (t > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			Arrange_Numbers_In_Array.arrange(arr, n);
			printArray(arr);
			t -= 1;
		}
	}
}

`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````


public class Solution {
	public static void arrange(int[] arr, int n) {
		int left = 0;
		int right = n - 1;
		int counter = 1;
		while (left <= right) {
			if (counter % 2 == 1) {
				arr[left] = counter;
				counter += 1;
				left += 1;
			} else {
				arr[right] = counter;
				counter += 1;
				right -= 1;
			}
		}
	}
}
