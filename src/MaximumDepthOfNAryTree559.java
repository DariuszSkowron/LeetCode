import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNAryTree559 {

    private int max = 0;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        maxDepth(root,1);
        return max;
    }

    public void maxDepth(Node node, int depth){
        if (node == null) return;
        max = Math.max(max,depth);
        for (Node child : node.children) {
            maxDepth(child, depth+1);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
