import java.util.*;
public class A78_Subsets {
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
        A78_Subsets sol=new A78_Subsets();
        int [] num={1,2,3};
        System.out.println(sol.subsets(num));
    }
}
