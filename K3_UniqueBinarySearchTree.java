
public class K3_UniqueBinarySearchTree {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        K3_UniqueBinarySearchTree solution = new K3_UniqueBinarySearchTree();
        int n = 3;
        System.out.println("Number of unique BSTs with " + n + " nodes: " + solution.numTrees(n));
    }
}
