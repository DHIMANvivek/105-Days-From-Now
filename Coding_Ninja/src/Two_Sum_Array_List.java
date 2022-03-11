import java.util.*;

public class Solution {
    
	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
        Collections.sort(arr);
        ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();
        int a_point = 0, b_point = n -1;
        
        while(a_point < b_point){
            if(arr.get(a_point) + arr.get(b_point) == target){
                Pair<Integer, Integer> pair = new Pair<>(arr.get(a_point),arr.get(b_point));
                ans.add(pair);
                a_point++;
                b_point--;
            }
            else if(arr.get(a_point) + arr.get(b_point) > target){
                b_point--;
            }
            else{
                a_point++;
            }
        }
        if(ans.size() == 0){
            Pair<Integer, Integer> pair = new Pair<>(-1,-1);
            ans.add(pair);
        }
        return ans;
	}
}
