import java.util.HashSet;

public class A217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        A217_ContainsDuplicate solution = new A217_ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3)); // Output: true
    }
}
