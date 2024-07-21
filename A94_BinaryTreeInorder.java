import java.util.ArrayList;
import java.util.List;

public class A94_BinaryTreeInorder {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val=x;}
    }
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    private void helper(TreeNode root, List<Integer> result){
        if(root != null){
            helper(root.left, result);
            result.add(root.val);
            helper(root.right,result);
        }
    }

    public static void main(String[] args) {
        A94_BinaryTreeInorder sol=new A94_BinaryTreeInorder();
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        List<Integer> inorderResult = sol.inorderTraversal(root);
        System.out.println(inorderResult);
    }
}
