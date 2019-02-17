public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        return (root == null) || check(root.left, root.right);
    }

    private boolean check(TreeNode leftSub, TreeNode rightSub){
        if (leftSub == null && rightSub == null){
            return true;
        }else if (leftSub != null && rightSub != null){
            return leftSub.val == rightSub.val &&
                    check(leftSub.left, rightSub.right) &&
                    check(leftSub.right, rightSub.left);
        }
        return false;
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
