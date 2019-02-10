import java.util.Arrays;

public class SearchInABinarySearchTree700 {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
//        System.out.println(Arrays.toString(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) return null;

            if (root.val == val) return root;
            else if (root.val > val) return searchBST(root.left, val);
            else if (root.val < val) return searchBST(root.right, val);
            return null;
        }
    }
}
