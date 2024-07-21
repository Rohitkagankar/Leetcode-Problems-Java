public class A33_searchIn_rotated_sorted_array {
    public static int searchArray(int [] nums, int target){
        if(nums== null || nums.length==0) return -1;
        int left=0;
        int right=nums.length-1;
        while (left <= right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)return mid;
            if(nums[left]<=mid){
                if(nums[left]<=target && target < nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        A33_searchIn_rotated_sorted_array sol=new A33_searchIn_rotated_sorted_array();
        int [] nums={4,5,6,0,1,2,3};
        int target=0;
        System.out.println(sol.searchArray(nums, target));
    }
}
