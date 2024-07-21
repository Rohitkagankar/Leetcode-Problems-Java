public class A99_RecoverBinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private TreeNode firstElement = null;
    private TreeNode secondElement = null;
    private TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        traverse(root);

        if (firstElement != null && secondElement != null) {

            int temp = firstElement.val;
            firstElement.val = secondElement.val;
            secondElement.val = temp;
        }
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);

        if (firstElement == null && prevElement.val >= root.val) {
            firstElement = prevElement;
        }

        if (firstElement != null && prevElement.val >= root.val) {
            secondElement = root;
        }

        prevElement = root;

        traverse(root.right);
    }

    private static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);

        A99_RecoverBinarySearchTree solution = new A99_RecoverBinarySearchTree();
        System.out.println("Before recovery:");
        printInOrder(root);

        solution.recoverTree(root);

        System.out.println("\nAfter recovery:");
        printInOrder(root);
    }
}
