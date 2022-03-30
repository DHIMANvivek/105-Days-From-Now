//Check Permutation

public class Solution {

	public static boolean isPermutation(String input1, String input2) {
        
        if(input1.length()!=input2.length())
        {
            return false;
        }
        
          int[] arr=new int[256];
        for(int i=0;i<input1.length();i++)
        {
            int val= (int)input1.charAt(i);
           // System.out.println(val);
            arr[val]+=1;
        }
        
         for(int i=0;i<input2.length();i++)
        {
            int val= (int)input2.charAt(i);
            arr[val]-=1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
	}

}
