import java.util.Arrays;

public class A169_MajarityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        A169_MajarityElement solution = new A169_MajarityElement();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority element in " + Arrays.toString(nums1) + " is: " + solution.majorityElement(nums1));
        System.out.println("Majority element in " + Arrays.toString(nums2) + " is: " + solution.majorityElement(nums2));
    }
}
