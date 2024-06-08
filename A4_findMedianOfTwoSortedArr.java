public class A4_findMedianOfTwoSortedArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total=nums1.length+nums2.length;
        int mid=total/2;
        int[] mergedArr= mergedArray(nums1,nums2,mid);
        if(total %2 !=0){
            return (double)mergedArr[mid];
        }else{
            return ((double)mergedArr[mid]+mergedArr[mid-1])/2; 
        }
       
    }
    public static int[]mergedArray(int []n1,int[]n2,int mid){
        int []merged=new int [mid+1];
        int ptr1=0;
        int ptr2=0;
        int ptr3=0;

        if(n1.length==0) return n2;
        if(n2.length==0) return n1;

        while(ptr1<n1.length && ptr2<n2.length & ptr3<=mid){
         if(n1[ptr1]<n2[ptr2]){
            merged[ptr3++]=n1[ptr1++];
         }else{
            merged[ptr3++]=n2[ptr2++];
         }
        }
        while(ptr2<n2.length && ptr3<=mid){
            merged[ptr3++]=n2[ptr2++];
        }
        while(ptr1<n1.length && ptr3<=mid){
            merged[ptr3++]=n1[ptr1++];
        }
        return merged;
    }
    public static void main(String[] args) {
        int []n1={1,3};
        int []n2={2};
        System.out.println(findMedianSortedArrays(n1,n2));
    }
}
