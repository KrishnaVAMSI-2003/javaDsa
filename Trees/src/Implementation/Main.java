package Implementation;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        //tree.build();
        Node root = tree.sampleTree();

        Traversals traversals = new Traversals();
        traversals.postorder(root);
        System.out.println();
        traversals.postorderIterative(root);
    }
}