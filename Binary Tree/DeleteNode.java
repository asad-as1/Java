class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } 
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } 
        else {
            // Node found
            if(root.left == null && root.right == null) return null;  
            
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children: Get inorder successor
            TreeNode successor = inorderSuccessor(root.right);
            root.val = successor.val;  // Replace value
            root.right = deleteNode(root.right, successor.val);  // Delete the successor
        }

        return root;
    }

    // Function to find the inorder successor (smallest value in the right subtree)
    private TreeNode inorderSuccessor(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Optional: Inorder traversal to check result
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        DeleteNode tree = new DeleteNode();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println("Original BST (inorder):");
        tree.inorder(root);

        System.out.println("\n\nAfter deleting 3:");
        root = tree.deleteNode(root, 3);
        tree.inorder(root);
    }
}
