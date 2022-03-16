import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals , (a , b) -> a.start - b.start);
        ArrayList<Interval> result = new ArrayList<Interval>();
        int i , j ;
        for(i = 0 ; i < intervals.length ;) 
        {
            j = i + 1;
            while(j < intervals.length && intervals[j].start < 1 + intervals[i].finish)
            {
                intervals[i].finish = Math.max(intervals[i].finish , intervals[j].finish);
                ++j;
            }
            result.add(intervals[i]);
            i = j;
        }
        return result;
    }
}
