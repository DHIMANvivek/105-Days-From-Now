import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        
      //ArrayList<Integer> a  = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for (int i:prices)
        {
            if(i < min)
            {
                min =i;
            }
            else if(i - min > max)
                max = i - min ; 
        }
        return max;
        
    }
}
