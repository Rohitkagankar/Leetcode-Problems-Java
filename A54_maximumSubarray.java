public class A54_maximumSubarray {
    public int maxSubArray(int [] nums){
        int maxsubArrayNum=nums[0];
        int currSum=nums[0];
        for(int i=1; i<nums.length; i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxsubArrayNum=Math.max(maxsubArrayNum,currSum);
        }
        return maxsubArrayNum;
    }
    public static void main(String[] args) {
        A54_maximumSubarray sol=new A54_maximumSubarray();
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sol.maxSubArray(nums));
    }
}
