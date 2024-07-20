import  java.util.*;

public class K2_UniqueBinarySearchtree2 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<TreeNode> generateTree(int n){
        if(n==0){
            return new ArrayList<>();
        }
        return genTree(1,n);
    }
    
    private List<TreeNode> genTree(int start, int end){
        List<TreeNode> alltree=new ArrayList<>();
        if(start > end){
            alltree.add(null);
            return alltree;
        }
        for(int i=start; i<=end; i++){

            List<TreeNode> lefttree=genTree(start, i-1);
            List<TreeNode> righttree=genTree(i+1, end);

            for(TreeNode left : lefttree){
                for(TreeNode right : righttree){
                    TreeNode currTree=new TreeNode(i);
                    currTree.left=left;
                    currTree.right=right;
                    alltree.add(currTree);
                }
            }

        }
        return alltree;
    }
    public static void main(String[] args) {
        K2_UniqueBinarySearchtree2 sol= new K2_UniqueBinarySearchtree2();
        List<TreeNode> trees=sol.generateTree(3);

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
