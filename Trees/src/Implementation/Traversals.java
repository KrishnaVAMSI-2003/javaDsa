package Implementation;

class Traversals extends IterativeTraversals{
    void inorder(Node node) {
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
    void preorder(Node node) {
        if(node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node) {
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }
}