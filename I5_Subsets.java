import java.util.*;
public class I5_Subsets {
    public List<List<Integer>> subsets(int [] num){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,num,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int start,int []num, List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=start; i<num.length; i++){
            current.add(num[i]);
            backtrack(i+1, num, current, result);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        I5_Subsets sol=new I5_Subsets();
        int [] num={1,2,3};
        System.out.println(sol.subsets(num));
    }
}
