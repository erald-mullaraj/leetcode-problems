import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> l = new ArrayList<>();
        if(root == null) {
            return l;
        }
        TreeNode cur = root;
        Stack<TreeNode> st = new Stack<>();

        while(!st.isEmpty() || cur != null){
            while(cur != null){
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            l.add(cur.val);
            cur = cur.right;
        }
        return l;
    }
}
