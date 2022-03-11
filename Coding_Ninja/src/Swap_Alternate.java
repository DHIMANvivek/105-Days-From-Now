import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap_Alternate {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public class Solution {

		public static void swapAlternate(int arr[]) {
			// Your code goes here
			int i;
			for (i = 0; i < arr.length; i += 2) {

				if (i + 1 < arr.length) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}

		}
	}

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] input = takeInput();
			Solution.swapAlternate(input);
			printArray(input);

			t -= 1;
		}
	}
}






