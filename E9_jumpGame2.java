public class E9_jumpGame2 {
    public static int jumsCount(int [] nums){
        int n=nums.length;
        int currend=0;
        int fartest=0;
        int jump=0;
        for(int i=0; i<nums.length-1; i++){
            fartest=Math.max(fartest, i+nums[i]);
            if(i==currend){
                jump++;
                currend=fartest;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int [] nums={2,3,1,1,4};
        System.out.println(jumsCount(nums));
    }
}
