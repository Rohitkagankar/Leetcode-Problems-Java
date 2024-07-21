
import java.util.Arrays;

public class A75_SortColors {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
