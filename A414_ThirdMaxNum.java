import java.util.Set;
import java.util.TreeSet;

public class A414_ThirdMaxNum {
    public int thirdMax(int[] nums) {
        // Use a TreeSet to maintain unique elements in sorted order
        Set<Integer> uniqueNumbers = new TreeSet<>();
        
        // Add each number to the set
        for (int num : nums) {
            uniqueNumbers.add(num);
            // If the set size exceeds 3, remove the smallest number
            if (uniqueNumbers.size() > 3) {
                uniqueNumbers.remove(((TreeSet<Integer>) uniqueNumbers).first());
            }
        }
        
        // If the set has less than 3 elements, return the maximum
        if (uniqueNumbers.size() < 3) {
            return ((TreeSet<Integer>) uniqueNumbers).last();
        }
        
        // Otherwise, return the smallest element in the set which is the third max
        return ((TreeSet<Integer>) uniqueNumbers).first();
    }

    public static void main(String[] args) {
        A414_ThirdMaxNum solution = new A414_ThirdMaxNum();
        int[] nums = {2,4,2, 3, 1};
        System.out.println(solution.thirdMax(nums)); // Output: 1
    }
}
