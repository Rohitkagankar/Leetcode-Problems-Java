public class J4_MergeSortedArray {
    public void mergeArray(int [] nums1,int m,int [] nums2 ,int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
    public static void main(String[] args) {
        J4_MergeSortedArray sol=new J4_MergeSortedArray();
        int [] num1={4,5,6,0,0,0,0};
        int [] num2={1,2,3};
        int m=3;
        int n=3;
        sol.mergeArray(num1,m,num2,n);
        for(int i=0; i<m+n-1; i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println();
    }
    
}
