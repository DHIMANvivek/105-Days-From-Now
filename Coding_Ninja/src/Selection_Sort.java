
public class SelectionSort {

	public static void selectionSort(int[] input) {
		for(int i = 0 ; i < input.length - 1 ; i++) {
			int min = input[i];
			int index = i;
			for(int j = i + 1 ; j < input.length ; j++) {
				if(input[j] < min)
				{
					int temp = min;
					min = input[j];
					input[j] = temp;
					index = j ;
				}
			}
			if(index != i) {
			input[index] = input[i]; 
 			input[i] = min;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] input = {1,4,24,5,44,7};
		selectionSort(input);
		for(int i = 0 ; i < input.length ; i++) {
			System.out.print(input[i]+ " ");
		}
	}

}


