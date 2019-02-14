public class ConvertBSTtoGreaterTree538 {

    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
       if (root == null) return null;
       convertBST(root.right);
       int tmp = root.val;
       root.val += sum;
       sum += tmp;
       convertBST(root.left);
       return root;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
