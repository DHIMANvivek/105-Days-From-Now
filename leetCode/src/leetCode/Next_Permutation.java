// brute 



class Solution {
    public void nextPermutation(int[] A) {
        if(A == null || A.length <= 1) return;
        int i = A.length  -2; // second last
        while(i >= 0 && A[i] >= A[i+1]) i--;
        if(i >= 0){
            int j = A.length - 1;
            while(A[j] <= A[i]) j--;
            swap(A,i,j);
        }
        reverse(A , i+1 , A.length - 1);
        
    }
    
    public void swap(int[] A , int i , int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public void reverse(int[] A , int i , int j){
        while(i<j) swap(A , i++ , j--);
    }
}



''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

// best


class Solution 
{    
    public void nextPermutation(int[] nums) 
    {
       int i=nums.length-2;
        int j=0;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0)
        {
            j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    
    public static void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public static void reverse(int nums[],int i,int j)
    {
        while(i<j)
        {
            swap(nums,i++,j--);
        }
    }
   
}
