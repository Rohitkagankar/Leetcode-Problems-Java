public class A35_find_firstandLast_position {
    public static int [] findPosition(int [] arr,int target){
        int [] result=new int[2];
        result[0]=firstPosition(arr,target);
        result[1]=LastPosition(arr,target);

        return result;
    }
    private static int firstPosition(int []arr,int target){
        if(arr==null && arr.length==0) return -1;

        int left=0;
        int right=arr.length;
        int firstPos=-1;

        while (left <= right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                firstPos=mid;
                right=mid-1;
            }else if(arr[mid] > target){
                right=mid-1;
            }else{
                left=mid+1;
            }
            
        }
        return firstPos;

    }
    private static int LastPosition(int [] arr, int target){
        if(arr==null && arr.length==0) return -1;

        int left=0;
        int right=arr.length;
        int secPosition=-1;

        while (left <= right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                secPosition=mid;
                left=mid+1;
            }else if(arr[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
        }
        return secPosition;
    }

    public static void main(String[] args) {
        A35_find_firstandLast_position sol=new A35_find_firstandLast_position();
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = sol.findPosition(nums1, target1);
        System.out.println("First and Last Position of " + target1 + ": [" + result1[0] + ", " + result1[1] + "]");
        
    }
}
