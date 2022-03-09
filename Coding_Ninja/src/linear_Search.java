import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class linear_Search {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int linearSearch(int arr[], int x) {
		// Your code goes here
		boolean flag = false;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				flag = true;
				break;
			}
		}

		if (flag == false)
			return -1;

		else
			return i;

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

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			int[] input = takeInput();
			int val = Integer.parseInt(br.readLine().trim());
			System.out.println(linear_Search.linearSearch(input, val));

			t -= 1;
		}
	}
}