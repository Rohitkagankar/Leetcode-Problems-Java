import java.util.*;

public class A39_CombinationSum {
    public static List<List<Integer>> CombinationSum (int [] candidates,int target){
        List<List<Integer>> result=new ArrayList<>();

        backtrack(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    private static void backtrack(int [] candidates, int target,int start,List<Integer> currentCombination,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=0; i<candidates.length; i++){
            currentCombination.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, currentCombination, result);
            currentCombination.remove(currentCombination.size()-1);
        }
    }
    public static void main(String[] args) {
        A39_CombinationSum sol=new A39_CombinationSum();
        int[] candidates={2,3,6,7};
        int target=7;
        List<List<Integer>> combinations=sol.CombinationSum(candidates, target);
        System.out.println(combinations);
    }
}
