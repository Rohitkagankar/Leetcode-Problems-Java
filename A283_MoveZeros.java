public class A283_MoveZeros {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        A283_MoveZeros solution = new A283_MoveZeros();
        
        // Example input array
        int[] nums = {0, 1, 0, 3, 12};
        
        // Print array before calling moveZeroes
        System.out.println("Before:");
        printArray(nums);

        solution.moveZeroes(nums);
        
        // Print array after calling moveZeroes
        System.out.println("After:");
        printArray(nums);
    }
}
