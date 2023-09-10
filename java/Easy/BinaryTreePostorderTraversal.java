package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer>postorderTraversal(TreeNode root){
        List<Integer> l = new ArrayList<>();
        recursion(root, l);
        return l;
    }

    public void recursion(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        recursion(root.left, res);
        recursion(root.right, res);
        res.add(root.val);
    }
}
