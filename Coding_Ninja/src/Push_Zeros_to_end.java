//Push Zeros to end
public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
        
        int[] ans = new int[arr.length];
        int k = 0 ;
        
        for(int i = 0 ; i <= arr.length-1 ; i++)
        {
            if(arr[i]!=0)
            {
                ans[k] = arr[i];
                k++;
            }
        }
        k++;
       
        while(k <= ans.length-1)
        {
            ans[k] = 0;
            k++;
        }
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = ans[i];
        }
        
    }

}
