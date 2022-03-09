import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Return_Array_Sum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int sum(int[] arr) {
		int res = 0;
		for (int j = 0; j < arr.length; j++) {
			res += arr[j];
		}
		return res;

	}

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().trim().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {
			int[] input = takeInput();
			System.out.println(Return_Array_Sum.sum(input));
			t -= 1;
		}
	}
}