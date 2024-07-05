import java.util.*;

public class G3_insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        int i = 0;
        // Add all intervals that end before the new interval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge all overlapping intervals with the new interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        
        // Add all intervals that start after the new interval ends
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        G3_insertInterval sol = new G3_insertInterval();
        int[] newinterval = { 4, 8 };
        int[][] intervals = { {1,2},{3,5},{6,7},{8,10},{12,16} };
        int[][] result = sol.insert(intervals, newinterval);

        for (int[] interval : result) {
            System.out.println("{" + interval[0] + "," + interval[1] + "}");
        }
    }
}
