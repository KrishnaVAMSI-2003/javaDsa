package Implementation;

import java.util.Scanner;

public class Tree extends Construction{
    Node root;
    Scanner sc = new Scanner(System.in);
    void build() {
        System.out.print("Enter value of root : ");
        int rootVal = sc.nextInt();
        sc.nextLine();
        Node root = new Node(rootVal);
        this.root = root;
        build(root);
    }

    void build(Node node) {
        System.out.print("Have left node for "+node.val+" ? (y/n)");
        String nxtline = sc.nextLine();
        if(nxtline.charAt(0)=='y') {
            System.out.print("Enter Value: ");
            int leftVal = sc.nextInt();
            sc.nextLine();
            Node left = new Node(leftVal);
            node.left = left;
            build(left);
        }
        System.out.print("Have right node for "+node.val+" ? (y/n)");
        nxtline = sc.nextLine();
        if(nxtline.charAt(0)=='y') {
            System.out.print("Enter Value: ");
            int rigthVal = sc.nextInt();
            sc.nextLine();
            Node right = new Node(rigthVal);
            node.right = right;
            build(right);
        }
    }
    public Node sampleTree() {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
        root.right.right = new Node(50);
        return root;
    }

    int size(Node root) {
        if(root==null) return 0;
        int left = size(root.left);
        int right = size(root.right);
        return 1+left+right;
    }
    int max(Node root) {
        if(root.left==null && root.right==null) return root.val;
        int max = root.val;
        if(root.left!=null) max = Math.max(max, max(root.left));
        if(root.right!=null) max = Math.max(max, max(root.right));
        return max;
    }
}