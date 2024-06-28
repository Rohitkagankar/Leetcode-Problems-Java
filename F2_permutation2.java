import java.util.*;
public class F2_permutation2 {
    public static List<List<Integer>> permutations2(int [] nums){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        backtrack(result,new ArrayList<>(),used,nums);
        return result;
    }
    private static void backtrack(List<List<Integer>> result,List<Integer>currlist,boolean [] used,int[] nums){
        if(currlist.size()==nums.length){
            result.add(new ArrayList<>(currlist));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1])){
                continue;
            }

            currlist.add(nums[i]);
            used[i]=true;
            backtrack(result, currlist, used, nums);
            used[i]=false;
            currlist.remove(currlist.size()-1);
        }

    }
    public static void main(String[] args) {
        F2_permutation2 sol=new F2_permutation2();
        int [] nums={1,1,2};
        List<List<Integer>> result=sol.permutations2(nums);
        for(List<Integer> num:result){
            System.out.println(num);
        }
    }
}
