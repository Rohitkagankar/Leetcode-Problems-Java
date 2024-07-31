import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class A144_BinaryTreePreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);      // Visit the root
        preorder(node.left, result);  // Traverse the left subtree
        preorder(node.right, result); // Traverse the right subtree
    }

    public static void main(String[] args) {
        // Creating a sample binary tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        A144_BinaryTreePreorder solution = new A144_BinaryTreePreorder();
        List<Integer> result = solution.preorderTraversal(root);

        System.out.println(result); // Output should be [1, 2, 4, 5, 3]
    }
}
