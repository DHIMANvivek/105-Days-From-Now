
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long max = Integer.MIN_VALUE;
        long cur = 0;
        int i = 0;
        for(i = 0 ; i<n; i++){
            cur = cur +  arr[i];
//             if(cur > max){
//                 max = cur;
//             }
            max = Math.max(cur,max);
            if(cur<0){
                cur = 0;
            }
           
        }
         return max;
	}

}
