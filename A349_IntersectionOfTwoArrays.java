
import java.util.HashSet;

public class A349_IntersectionOfTwoArrays {

    public int[] intersection(int [] nums1, int []nums2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check if elements of nums2 are in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the result set to an array
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        // Example arrays
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        // Create an instance of Solution
        A349_IntersectionOfTwoArrays solution = new A349_IntersectionOfTwoArrays();

        // Call the intersection method
        int[] result = solution.intersection(nums1, nums2);

        // Print the result
        System.out.print("Intersection of the two arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
