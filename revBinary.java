//preorder traversal in binary tree
import java.util.*;
public class revBinary {
    
    static class Node{
        //node class for BT
        int val;
        Node left;
        Node right;
        //construtot to initalise the value
        Node(int x){
            val=x;
            left=null;
            right=null;
        }
    }
    public static void main(String[] args) {
        //simple binary tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        // getting preOrderTraversal
        List<Integer> result=preOrderTraversal(root);
        //itearte the result
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i)+" ");
        }
    }
    //fun to perform preorderTraversal and store the value in List
    static List<Integer> preOrderTraversal(Node root){
        List<Integer> arr=new ArrayList<>();//empty list to store preorderT 
        preOrder(root,arr);
        return arr;
    }
    static void preOrder(Node root,List<Integer> arr){
        if(root==null)//base case rcursion
        return;
        arr.add(root.val);//push current node onto the stack
        preOrder(root.left, arr);//recursevely traverse left subtree
        preOrder(root.right, arr);
    }
}