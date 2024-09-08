import java.util.Arrays;
import java.util.List;

public class A120_TriangleMinSum {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        // Copy the last row of the triangle as our dp array
        int[] dp = new int[triangle.size()];
        for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++) {
            dp[i] = triangle.get(triangle.size() - 1).get(i);
        }

        // Start from the second last row and move upwards
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // Update dp array with the minimum path sum of the current element
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        // The top element now contains the minimum path sum
        return dp[0];
    }
    public static void main(String[] args) {
        A120_TriangleMinSum triangleSolver = new A120_TriangleMinSum();
        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );
        int result = triangleSolver.minimumTotal(triangle);
        System.out.println("Minimum path sum: " + result);  // Output: 11
    }
}
