public class A80_RemoveDuplicateSortedArray2 {
    public int removeDuplicate (int [] nums){
        if(nums.length<=2) return nums.length;
        int index=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[index-2]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        A80_RemoveDuplicateSortedArray2 sol=new A80_RemoveDuplicateSortedArray2();
        int [] nums={1,1,1,2,2,3,4,5};
        System.out.println(sol.removeDuplicate(nums));

    }
}
