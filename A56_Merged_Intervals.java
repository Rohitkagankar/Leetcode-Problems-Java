import java.util.Arrays;
import java.util.LinkedList;

public class A56_Merged_Intervals {
    public int[][] mergedIntervals(int [][] intervals){
        if(intervals.length==0){
            return new int[0][];
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        LinkedList<int []> merged=new LinkedList<>();
        for(int[] interval : intervals){

            if(merged.isEmpty() || merged.getLast()[1]<interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1]=Math.max(interval[1],merged.getLast()[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
    public static void main(String[] args) {
        A56_Merged_Intervals sol=new A56_Merged_Intervals();
        int [][] intervals={{1,3},{2,3},{4,5}};
        printIntervals(sol.mergedIntervals(intervals));

    }
}
