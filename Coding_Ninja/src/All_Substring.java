
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
       
        for(int start = 0 ; start <= str.length() ; start++)
        { 
           for(int end = start+1 ; end <= str.length() ; end++)
           {
               System.out.println(str.substring(start,end));

           }
        	
       

        }
	}

}
