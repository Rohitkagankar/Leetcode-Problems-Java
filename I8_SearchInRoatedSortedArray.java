public class I8_SearchInRoatedSortedArray {
    public boolean searchArray(int [] nums,int target){
        int left=0,right=nums.length-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[left]==nums[mid] && nums[right]==nums[mid]){
                left++;
                right--;
            }else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target < nums[mid]){
                    right=mid-1;

                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        I8_SearchInRoatedSortedArray sol=new I8_SearchInRoatedSortedArray();
        int [] nums={2,5,6,0,0,1,2};
        int target=6;
        System.out.println(sol.searchArray(nums,target));
    }
}
