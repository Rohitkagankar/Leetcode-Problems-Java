import java.util.*;
public class A118_PascalsTriangle {
    public List<List<Integer>> generate(int val){
        List<List<Integer>> result=new ArrayList<>();
        if(val==0){
            return result;
        }
        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);

        for(int i=1; i<val; i++){
            List<Integer> prevrow=result.get(i-1);
            List<Integer> row=new ArrayList<>();

            row.add(1);
            for(int j=1; j<i; j++){
                row.add(prevrow.get(j)+prevrow.get(j-1));
            }

            row.add(1);
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        A118_PascalsTriangle pt=new A118_PascalsTriangle();
        int numRows = 5;  // Example input
        List<List<Integer>> result = pt.generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
