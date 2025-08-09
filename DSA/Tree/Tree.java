// package DSA.Tree;

import java.util.*;
public class Tree {
    Scanner sc = new Scanner(System.in);

    class Node {
        int val;
        Node left;
        Node right;
        public Node(int val){
           this.val = val;
           this.left = null;
           this.right = null;
        }
    }
    private Node root = null;

    public void createtree(){
        this.root = createtree(this.root);
    }

    private Node createtree(Node root){
        int val = sc.nextInt();
        Node nn = new Node(val);
        int hln = sc.nextInt();
        // if(hln){
        //     nn.left = createtree(nn);
        // }
        // boolean hrn = sc.nextBoolean();
        // if(hrn){
        //     nn.right = createtree(nn);
        // }
        if(hln != -1){
            nn.left = createtree(nn);
        }
        int hrn = sc.nextInt();
        if(hrn != -1){
            nn.right = createtree(nn);
        }
        return nn;
    }
    public void preorder(){
        preorder(this.root);
    }

    private void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.createtree();
        tree.preorder();
    }
}