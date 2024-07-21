
public class A101_SymmetricTree {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null && t2 == null) return true;
        if(t1==null || t2==null) return false;
        return (t1.val==t2.val) && isMirror(t1.right,t2.left) && isMirror(t1.left,t2.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        A101_SymmetricTree solution = new A101_SymmetricTree();
        boolean result = solution.isSymmetric(root);
        
        System.out.println("Is the tree symmetric? " + result);
    }
}
