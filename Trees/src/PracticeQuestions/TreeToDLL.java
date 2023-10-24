package PracticeQuestions;

import Implementation.Node;
import Implementation.Tree;

public class TreeToDLL {
    static Node prev;
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.sampleTree();
        inorder(root);
    }
    static void inorder(Node node) {
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }

    static Node toDll(Node node) {
        if(node == null) return node;
        Node head = toDll(node.left);
        if(prev==null) head = node;
        else {
            node.left = prev;
            prev.right = node;
        }
        prev = node;
        return head;
    }
}
