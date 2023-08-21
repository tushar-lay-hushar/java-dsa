public class SingleValueTree {

    public static void main(String[] args) {

    }


    static int count = 0;

    static Integer find_single_value_trees(BinaryTreeNode root) {
        // Write your code here.
        if(root == null) return 0;
        count = 0;
        return count;
    }

    static boolean findUnivalTrees(BinaryTreeNode root) {
        if(root.left == null && root.right == null) {
            count++;
            return true;
        }

        boolean uniVal = true;

        if(root.left != null) {
            uniVal = findUnivalTrees(root.left) && (root.left.value == root.value);
        }

        if(root.right != null) {
            uniVal = findUnivalTrees(root.right) && (root.right.value == root.value);
        }

        if (uniVal) {
            count++;
        }

        return uniVal;
    }
}
