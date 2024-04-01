package Easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class InvertBinaryTree {

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(7);
        TreeNode t0 = new TreeNode(4, t1, t2);
        System.out.println(t0.val + " " + t0.left.val + " " + t0.right.val);
        TreeNode rt = invertTree(t0);
        System.out.println(rt.val + " " + rt.left.val + " " + rt.right.val);
    }

    public static TreeNode invertTree(TreeNode root){
        if (root == null) return null;
        TreeNode n = new TreeNode(root.val);
        n.right = invertTree(root.left);
        n.left = invertTree(root.right);
        return n;
    }
}
