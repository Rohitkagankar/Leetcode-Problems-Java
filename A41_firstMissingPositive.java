public class A41_firstMissingPositive {
    public int firstMissNumber(int [] nums){
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <=0 || nums[i]>n){
                nums[i]=n+1;
            }
        }
        for(int i=0; i<nums.length; i++){
            int num=Math.abs(nums[i]);
            if(num <=n){
                nums[num-1]=-Math.abs(num-1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        A41_firstMissingPositive sol=new A41_firstMissingPositive();
        int nums[]={0,4,5,-2};
        System.out.println(sol.firstMissNumber(nums));
    }
}
