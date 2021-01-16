import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BalancedBinaryTree110 {


    public static void main(String[] args) {



        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)) ,new TreeNode(3)), new TreeNode(2 ,null, null));
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2 ,null, new TreeNode(3)));


        System.out.println(isBalanced(root2));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        var leftHeight = height(root.left);
        var rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int height(TreeNode node){
        if(node == null) return 0;

        return 1+ Math.max(height(node.left), height(node.right));
    }


}
