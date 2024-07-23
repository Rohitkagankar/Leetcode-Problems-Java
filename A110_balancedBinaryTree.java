
public class A110_balancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        if (leftHeight == -1) {
            return -1; // not balanced
        }

        int rightHeight = height(node.right);
        if (rightHeight == -1) {
            return -1; // not balanced
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // not balanced
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        A110_balancedBinaryTree solution = new A110_balancedBinaryTree();

        // Creating a balanced binary tree
        TreeNode balancedRoot = new TreeNode(1);
        balancedRoot.left = new TreeNode(2);
        balancedRoot.right = new TreeNode(3);
        balancedRoot.left.left = new TreeNode(4);
        balancedRoot.left.right = new TreeNode(5);
        balancedRoot.right.left = new TreeNode(6);
        balancedRoot.right.right = new TreeNode(7);

        System.out.println("Is balanced tree balanced? " + solution.isBalanced(balancedRoot)); // should return true

        // Creating an unbalanced binary tree
        TreeNode unbalancedRoot = new TreeNode(1);
        unbalancedRoot.left = new TreeNode(2);
        unbalancedRoot.left.left = new TreeNode(3);
        unbalancedRoot.left.left.left = new TreeNode(4);

        System.out.println("Is unbalanced tree balanced? " + solution.isBalanced(unbalancedRoot)); // should return false
    }
}
