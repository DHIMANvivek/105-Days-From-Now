public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        
       
		String ans="";
        int i=0;
        int start=0;
        for(;i<input.length();i++){
            if(input.charAt(i)==' '){
                int end=i-1;
                String word="";
                for(int j=start;j<=end;j++){
                    word=word+input.charAt(j);
                }
                ans=word+" "+ans;
                start=i+1;
            }
        }
          int end=i-1;
        String word="";
        for(int j=start;j<=end;j++){
                    word=word+input.charAt(j);
        }
                ans=word+" "+ans;
        return ans;

	


	}
}
