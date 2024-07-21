import java.util.Arrays;

public class A32_nextPermutation {
    public static void nextPermutation(int [] arr){
        if (arr == null || arr.length <= 1) return;
        int i=arr.length-2;
        while (i>=0 && arr[i]>=arr[i+1]) {
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while (j>=0 && arr[i]>=arr[j]) {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);

    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int [] arr, int start){
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        A32_nextPermutation sol=new A32_nextPermutation();
        int []arr={1,1,5,4,6};
        int [] arr1={1,1,5,4,1};
        sol.nextPermutation(arr);
        sol.nextPermutation(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
