import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NAryTreePreorderTraversal589 {


    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return list;
        list.add(root.val);
        for (Node node : root.children) preorder(node);

        return list;
    }

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
}
