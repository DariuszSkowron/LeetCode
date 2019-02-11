public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        return node;
    }


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

}


//Solution #2
//public class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        if(root == null) return null;
//        TreeNode tmp = root.left;
//        root.left = invertTree(root.right);
//        root.right = invertTree(tmp);
//        return root;
//    }
//}