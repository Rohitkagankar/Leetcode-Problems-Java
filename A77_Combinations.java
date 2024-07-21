import java.util.*;
public class A77_Combinations {
    public List<List<Integer>> combin(int n,int t){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(), n,t,1);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> combination,int n,int k,int start){
        if(combination.size()==k){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start; i<=n; i++){
            combination.add(i);
            backtrack(result, combination, n, k, i+1);
            combination.remove(combination.size()-1);
        }
    }
    public static void main(String[] args) {
        A77_Combinations sol=new A77_Combinations();
        int n=4;
        int t=2;
        System.out.println(sol.combin(n,t));
    }
}
