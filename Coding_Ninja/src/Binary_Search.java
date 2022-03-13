
public class BinarySearch {

	public static int binarySearch(int[] input, int ele) {
		int start = 0;

		int end = input.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (ele == input[mid]) {
				return mid;
			} else if (ele > input[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] input = { 2, 4, 5, 8, 19, 21, 28 };
		int index = binarySearch(input, 19);
		System.out.println(index);

	}

}



`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````







public class Solution { 

   public static int binarySearch(int[] arr, int ele){

        int start=0;
       int end=arr.length-1;
    

        while(start<=end)
        {    

          int mid=(start+end)/2;


            if(arr[mid]==ele)
            {
                return mid;
            }
            if(arr[mid] < ele)
            {
                start=mid+1;

            }else
            {
                end=mid-1;


            }

        }
		return -1;
	}
}
