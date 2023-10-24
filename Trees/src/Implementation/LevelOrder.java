package Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.val+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
    void levelOrderByLineM1(Node root) {
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            Node curr = q1.remove();
            if(curr.left!=null) q2.add(curr.left);
            if(curr.right!=null) q2.add(curr.right);
            System.out.print(curr.val+" ");
            if(q1.isEmpty()) {
                System.out.println();
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            }
        }
    }
    void levelOrderByLineM11(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++) {
                Node curr = q.poll();
                System.out.print(curr.val+" ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            System.out.println();
        }
    }
    static void levelOrderByLineM2(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(null);
        q.add(root);
        while(q.size()>1) {
            Node curr = q.poll();
            if(curr==null) {
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.val+" ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
}
