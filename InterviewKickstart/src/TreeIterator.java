import java.util.Stack;

public class TreeIterator {

    Stack<BinaryTreeNode> s;

    TreeIterator(BinaryTreeNode node) {
        s = new Stack<>();
        insertAllLeftChild(node);
    }

    private void insertAllLeftChild(BinaryTreeNode node) {
        while (node != null) {
            s.push(node);
            node = node.left;
        }
    }

    int next() {
        BinaryTreeNode node = s.pop();
        if (node.right != null) {
            insertAllLeftChild(node.right);
        }
        return node.value;
    }

    int has_next() {
        if (s.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
