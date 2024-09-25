import java.util.Arrays;

public class A179_LargestNumber {
    public String largestNumber(int[] nums) {

        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        

        if (strNums[0].equals("0")) {
            return "0";
        }
        
        StringBuilder largestNum = new StringBuilder();
        for (String num : strNums) {
            largestNum.append(num);
        }
        
        return largestNum.toString();
    }

    public static void main(String[] args) {
        A179_LargestNumber solution = new A179_LargestNumber();
        
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(solution.largestNumber(nums));
    }
}
