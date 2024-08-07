public class A55_JumpGame {
    public boolean isJump(int [] nums){
        int maxReach=0;
        for(int i=0; i<nums.length; i++){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach, i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        A55_JumpGame sol=new A55_JumpGame();
        int [] nums={3,2,1,0,4};
        System.out.println(sol.isJump(nums));

    }
}
