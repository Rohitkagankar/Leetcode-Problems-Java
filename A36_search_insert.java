public class A36_search_insert {
    public static int searchInsert(int [] nums, int target){
        if(nums==null && nums.length==0) return -1;
        int left=0;
        int right=nums.length-1;
        while (left <= right) {
            int mid=left+(right-left)/2;
            if(nums[mid]== target){
                return mid;

            }else if(nums[mid] > target){
                right=mid-1;
            }else{
                left=mid+1;
            }
            
        }
        return left;
    }
    public static void main(String[] args) {
        A36_search_insert sol=new A36_search_insert();
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Insert position of " + target1 + ": " + sol.searchInsert(nums1, target1));
        
    }
}
