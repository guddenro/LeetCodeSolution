/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node.left != null){
                  queue.add(node.left);
                }
                if (node.right != null){
                  queue.add(node.right);
                }
                sum += node.val;
               
            }
            list.add(sum);
        }

        queue.add(root);
        root.val = 0;
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                int siblingSum = (node.left != null?node.left.val:0) + 
                        (node.right != null?node.right.val : 0); 
                if (node.left != null){
                    node.left.val = list.get(level)- siblingSum;
                  queue.add(node.left);
                }
                if (node.right != null){
                    node.right.val = list.get(level)- siblingSum;
                  queue.add(node.right);
                }
                
               
            }
            level++;
        }

        return root;
        
    }
}