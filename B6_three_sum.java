import java.util.*;
public class B6_three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums); // Sort the array first
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // Skip duplicates
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move left pointer to the right skipping over duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                    
                    // Move right pointer to the left skipping over duplicates
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                } else if (sum < 0) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        B6_three_sum sol=new B6_three_sum();
        int [] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> result= sol.threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
