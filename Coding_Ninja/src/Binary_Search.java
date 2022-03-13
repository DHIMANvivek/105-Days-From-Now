
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
