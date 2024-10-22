public class A485_maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        A485_maxConsecutiveOnes solution = new A485_maxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums));  // Output: 3
        int[] nums1 = {1, 1, 0,1,2,3,1,1,1,1,5};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums1));  // Output: 3
    
    }
}
