
public class A112_PathSum {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        // If the tree is empty, return false
        if (root == null) {
            return false;
        }
        
        // If we've reached a leaf node, check if the path sum equals the given sum
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        
        // Recursively check the left and right subtrees with the updated sum
        sum -= root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        
        int sum = 22;
        
        A112_PathSum solution = new A112_PathSum();
        
        boolean result = solution.hasPathSum(root, sum);
        
        // Print the result
        System.out.println("Does the tree have a path sum equal to " + sum + "? " + result);
    }
}
