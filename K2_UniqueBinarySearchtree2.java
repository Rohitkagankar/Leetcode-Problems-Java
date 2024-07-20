import  java.util.*;

public class K2_UniqueBinarySearchtree2 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return genTrees(1, n);
    }

    private List<TreeNode> genTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = genTrees(start, i - 1);

            List<TreeNode> rightTrees = genTrees(i + 1, end);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left;
                    currTree.right = right;
                    allTrees.add(currTree);
                }
            }
        }
        return allTrees;
    }
    public static void main(String[] args) {
        K2_UniqueBinarySearchtree2 sol= new K2_UniqueBinarySearchtree2();
        List<TreeNode> trees=sol.generateTrees(3);

        for (TreeNode root : trees) {
            System.out.println(treeToString(root));
            System.out.println();
        }
    }
    private static String treeToString(TreeNode root) {
        if (root == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        String left = treeToString(root.left);
        String right = treeToString(root.right);

        if (left != "null" || right != "null") {
            sb.append("(");
            sb.append(left);
            sb.append(",");
            sb.append(right);
            sb.append(")");
        }

        return sb.toString();
    }
}
