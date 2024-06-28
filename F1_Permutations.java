import java.util.*;
public class F1_Permutations {
    public static List<List<Integer>> permutations(int [] nums){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result, new ArrayList<>(),nums);
        return result;
    }
    private static void backtrack(List<List<Integer>> result,List<Integer> templist,int []nums){
        if(templist.size()==nums.length){
            result.add(new ArrayList<>(templist));
        }else{
            for(int i=0; i<nums.length; i++){
                if(templist.contains(nums[i])) continue;
                templist.add(nums[i]);
                backtrack(result, templist, nums);
                templist.remove(templist.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        F1_Permutations sol=new F1_Permutations();
        int [] nums={1,2,3};
        List<List<Integer>> result=sol.permutations(nums);
        for(List<Integer> list : result){
            System.out.println(list);
        }
    }
}
