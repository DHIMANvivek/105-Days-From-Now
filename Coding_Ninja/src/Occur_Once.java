public class Solution {
    public static int occursOnce(int[] a, int n) {
        // Write your code here.
        // a^a=0
        //0^a=a
        int ans = 0;

   for(int i = 0; i < n; i++){

       ans = ans^a[i];

   }

   return ans;
    }
}
