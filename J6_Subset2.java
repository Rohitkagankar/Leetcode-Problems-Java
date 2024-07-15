import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J6_Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // Skip duplicates
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    public static void main(String[] args) {
        J6_Subset2 sol=new J6_Subset2();
        int [] nums={1,2,3};
        List<List<Integer>> result=sol.subsetsWithDup(nums);
        for(List<Integer> val : result){
            System.out.print("[");
            for(int j : val){
                System.out.print( j +" ");
            }
            System.out.print("]"+" ");
        }
    }
}
