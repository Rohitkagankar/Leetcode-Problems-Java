public class C8_remDupliSortedArray {
    public static int uniqueElement(int[] nums){
        if(nums==null || nums.length==0) return 0;

        int index=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3,3,4,5};
        System.out.println(uniqueElement(nums));
    }
}