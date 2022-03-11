public class Solution {

    public static int find(long n) {
         
   if(n == 1) return 0;
        int trade = 0;
        while(n>1){
            if(n%2==0){
               n = n/2;
           }
         else n = n-1;
            trade++;
      }
  return trade;
  }
}
