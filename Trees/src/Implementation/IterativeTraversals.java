package Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeTraversals extends LevelOrder{
    void inorderIterative(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while (curr!=null || !s.isEmpty()) {
            while (curr!=null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.val+" ");
            curr = curr.right;
        }
    }

    void preorderIterative(Node root) {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(curr!=null || !s.isEmpty()) {
            while(curr!=null) {
                System.out.print(curr.val+" ");
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            curr = curr.right;
        }
    }

    void postorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        while(true) {
            while(root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }

            // Check for empty stack
            if(stack.empty()) return;
            root = stack.pop();

            if(!stack.empty() && stack.peek() == root) root = root.right;

            else {

                System.out.print(root.val + " "); root = null;
            }
        }
    }
}