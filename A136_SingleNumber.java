public class A136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        A136_SingleNumber solution = new A136_SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = solution.singleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}
