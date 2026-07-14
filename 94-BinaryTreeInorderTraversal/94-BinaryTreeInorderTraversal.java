// Last updated: 14/07/2026, 16:05:18
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorder(node.left, result);   // Left
        result.add(node.val);         // Root
        inorder(node.right, result);  // Right
    }
}