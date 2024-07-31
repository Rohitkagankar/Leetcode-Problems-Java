import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class A145_BinaryTreePostorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.push(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        while (!output.isEmpty()) {
            result.add(output.pop().val);
        }

        return result;
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

        A145_BinaryTreePostorder solution = new A145_BinaryTreePostorder();
        List<Integer> result = solution.postorderTraversal(root);

        System.out.println(result); // Output should be [4, 5, 2, 3, 1]
    }
    
}