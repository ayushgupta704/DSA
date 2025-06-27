/*Binary tree representation */

// class Node{
//     int data;
//     Node left;
//     Node right;

//     public Node(int key){
//         data=key;
//         left=null;
//         right=null;
//     }
// }

// public class traversal {
//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.right=new Node(8);
//     }
// }

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        data=key;
        left=null;
        right=null;
    }

}
public class traversal {
    //function to perform preorder traversal of the tree and store values n array
    static void preorder(Node root,List<Integer>arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        preorder(root.left,arr);
        preorder(root.right, arr);
    }
    static List<Integer> preOrder(Node root){
        List<Integer> arr=new ArrayList<>();
        preorder(root, arr);
        return arr;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(6);

        List<Integer>result=preOrder(root);
        System.out.print("Preorder traversal: ");
        for(int val:result){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}