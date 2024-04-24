public class A1_Two_sum {
  
    public static void twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    int arr[]={i,j};
                    printArray(arr);
                }
            }
        }
        return ;
    }
    public static void printArray(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        int num[]={3,2,4};
        int target = 6;
        twoSum(num,target);
    }
    
}