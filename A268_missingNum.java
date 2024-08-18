public class A268_missingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        A268_missingNum solution= new A268_missingNum();

        int[] nums1 = {3, 0, 1};
        int missingNumber1 = solution.missingNumber(nums1);
        System.out.println("Missing number in [3, 0, 1]: " + missingNumber1); // Output: 2

    }
}
