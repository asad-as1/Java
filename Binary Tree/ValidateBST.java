class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class ValidateBST {

    // Main function to check if a binary tree is a BST
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Helper function with min/max range
    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        // Left subtree must be < node.val
        // Right subtree must be > node.val
        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
        ValidateBST validator = new ValidateBST();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(6);  // ❌ Invalid: 6 < 10 but on right subtree
        root.right.right = new TreeNode(20);

        boolean result = validator.isValidBST(root);
        System.out.println("Is valid BST? " + result);
    }
}
