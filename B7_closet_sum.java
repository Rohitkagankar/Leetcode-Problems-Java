import java.util.Arrays;

public class B7_closet_sum {
    public int threeSumCloset(int [] nums, int target){
        Arrays.sort(nums);
        int closetSum = nums[0]+ nums[1]+nums[2];

        for(int i=0; i<nums.length-2; i++){
            int left=i+1;
            int right=nums.length-1;

            while (left<right) {
                int currSum=nums[i]+ nums[left]+nums[right];

                if(Math.abs(currSum-target) < Math.abs(closetSum-target)){
                    closetSum=currSum;
                }
                if(currSum<target){
                    left++;
                }else if (currSum > target){
                    right--;
                }else{
                    return closetSum;
                }
                
            }
        }
        return closetSum;
    }
    public static void main(String[] args) {
        B7_closet_sum sol=new B7_closet_sum();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = sol.threeSumCloset(nums, target);
        System.out.println("The sum that is closest to the target is: " + result);
    }
}
