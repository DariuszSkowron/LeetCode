import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal590 {


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
}

List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null) return list;
        for (Node node : root.children) postorder(node);

            list.add(root.val);

            return list;
        }
    }

