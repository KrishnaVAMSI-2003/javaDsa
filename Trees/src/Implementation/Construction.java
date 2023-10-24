package Implementation;

public class Construction {
    void construct(int[] inorder, int[] preorder) {
        Node root = new Node(preorder[0]);
        int index = find(inorder, root.val, 0, inorder.length-1);
        if(index>0) root.left = new Node(inorder[index-1]);
        if(index<inorder.length) root.right = new Node(inorder[index+1]);
    }
    int find(int[] arr, int target, int st, int end) {
        for(int i=st;i<=end;i++) {
            if(arr[i]==target) return i;
        }
        return -1;
    }
}
