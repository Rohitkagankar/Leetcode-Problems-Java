import java.util.*;

public class G3_insertInterval {
public int [][] insertInterval(int [][] intervals, int [] newinterval){
    List<int []> result=new ArrayList<>();
    int i=0;

    while (i<intervals.length && intervals[i][1] <newinterval[0]) {
        result.add(newinterval);
        i++;
    }
    while (i<intervals.length && intervals[i][0] <=newinterval[1]) {
        newinterval[0]=Math.min(intervals[i][0], newinterval[0]);
        newinterval[1]=Math.max(intervals[i][1], newinterval[1]);
        i++;
    }
    result.add(newinterval);
    while (i<intervals.length) {
        result.add(intervals[i]);
        i++;
    }
    return result.toArray(new int[result.size()][] );
}
    public static void main(String[] args) {
        G3_insertInterval sol=new G3_insertInterval();
        int [] newinterval={2,5};
        int [][] intervals={{1,3},{6,9}};
        int [][] result=sol.insertInterval(intervals,newinterval);

        for (int [] interval: result){
            System.out.println("{" + interval[0]+","+ interval[1]+"}");
        }
    }
}
