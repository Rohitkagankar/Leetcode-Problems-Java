import java.util.HashMap;

public class A697_DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        
        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            left.putIfAbsent(num, i);
            
            right.put(num, i);
            
            count.put(num, count.getOrDefault(num, 0) + 1);
            
            degree = Math.max(degree, count.get(num));
        }
        
        int minLength = nums.length;

        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int length = right.get(num) - left.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }
        
        return minLength;
    }
    public static void main(String[] args) {
        A697_DegreeOfAnArray solution = new A697_DegreeOfAnArray();
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println("Shortest subarray length: " + solution.findShortestSubArray(nums));  // Output: 2
        int[] nums1 = {1, 2, 3,4,5,4,6,3,4};
        System.out.println("Shortest subarray length: " + solution.findShortestSubArray(nums1));
    }
}
