//https://www.codingninjas.com/codestudio/problems/631055?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

public class Solution 
{
    public static void sort012(int[] arr)
    {
        int low = 0 ; int mid = 0; int high = arr.length  - 1;
        
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++ ; 
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp2 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp2;
                high--;
            }
        }
	}
}
