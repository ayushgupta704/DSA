
import java.util.*;



// public class binaryTree {
//     public static void main(String[] args) {
//         //Create simple binary tree
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         //getting preorder traversal
//         List<Integer> result=preOrder(root);
//         //
//         for(int i=0;i<result.size();i++){
//             System.out.print(result.get(i)+" ");
//         }
//     }

//     static List<Integer> preOrder(Node root){
//         //store the preorder traversal in empty list
//         List<Integer> arr=new ArrayList<>();
//         preOrder(root,arr);

//         //return the resulting list containing preorder traversal
//         return arr;
//     }
//     static void preOrder(Node root,List<Integer> arr){
//         if(root==null)//base case recursion
//         return;

//         //push the current node in empty list
//         arr.add(root.data);
//         //recursively traverse the left subtree
//         preOrder(root.left,arr);
//         //recursively traverse right subtree;
//         preOrder(root.right,arr);
//     }
// }

// public class binaryTree {
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int val){
//             data=val;
//             left=null;
//             right=null;
//         }
//     }
//     public static void main(String[] args) {
//         //create simple binary tree
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.right=new Node(4);
//         root.right.right=new Node(5);
//         //preorder traversal
//         List<Integer> result=preOrder(root);
//         for(int i=0;i<result.size();i++){
//             System.out.print(result.get(i)+" ");
//         }

//     }
//     static List<Integer> preOrder(Node root){
//         List<Integer> arr=new ArrayList<>();
//         preOrder(root,arr);
//         return arr;
//     }
//     static void preOrder(Node root,List<Integer>arr){
//         if(root==null)
//         return;
//         arr.add(root.data);
//         preOrder(root.left,arr);
//         preOrder(root.right,arr);
//     }
// }


// import java.util.ArrayList;
// import java.util.LinkedList;
// import  java.util.List;
// import java.util.Queue;


// public class binaryTree {

//     static class TreeNode{
//         int val;
//         TreeNode left;
//         TreeNode right;

//         TreeNode(){
//             this.val=0;
//             this.left=null;
//             this.right=null;
//         }
//         TreeNode(int x){
//             this.val=x;
//             this.left=null;
//             this.right=null;
//         }
//         TreeNode(int x,TreeNode left,TreeNode right){
//             this.val=x;
//             this.left=left;
//             this.right=right;
//         }
//     }
//     static void printList(List<Integer> list){
//         for(int num:list){
//             System.out.print(num);
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         TreeNode root=new TreeNode(1);
//         root.left=new TreeNode(2);
//         root.right=new TreeNode(3);
//         root.left.left=new TreeNode(4);
//         root.left.right=new TreeNode(5);

//         binaryTree tree=new binaryTree();
//         List<List<Integer>> result=tree.levelOrder(root);
//         for(List<Integer> level:result){
//             printList(level);
//         }

//     }
//     public List<List<Integer>> levelOrder(TreeNode root){
//         List<List<Integer>> ans=new ArrayList<>();
//         if(root==null){
//             return ans;
//         }
//         Queue<TreeNode> q=new LinkedList<TreeNode>();
//         q.add(root);
//         while(!q.isEmpty()){
//             int size=q.size();
//             List<Integer>level=new ArrayList<>();
//             for(int i=0;i<size;i++){
//                 TreeNode node=q.poll();
//                 level.add(node.val);
//                 if(node.left!=null){
//                     q.add(node.left);
//                 }
//                 if(node.right!=null){
//                     q.add(node.right);
//                 }
//             }
//             ans.add(level);
//         }
//         return ans;
//     }
// }

// class Node{
//         int val;
//         Node left;
//         Node right;

//         Node(int x){
//             val=x;
//             left=null;
//             right=null;
//         }
//     }
// public class binaryTree {
  
//     public static void main(String[] args) {
//         //create simple binary tree
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         binaryTree solution=new binaryTree();
//         List<Integer> result=solution.preOrderTraversal(root);

//         for(int i=0;i<result.size();i++){
//             System.out.println(result.get(i)+" ");
//         }
//     }

//     public List<Integer> preOrderTraversal(Node root){
//         List<Integer> preOrder=new ArrayList<>();
//         if(root==null){
//             return preOrder;
//         }
//         Stack<Node>st=new Stack<>();
//         st.push(root);
//         while(!st.empty()){
//             root=st.pop();
//             preOrder.add(root.val);
        
//         if(root.right!=null){
//             st.push(root.right);
//         }
//         if(root.left!=null){
//             st.push(root.left);
//         }
//     }
//     return preOrder;
//     }

    
// }


// public class binaryTree {

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         binaryTree sol=new binaryTree();
//         List<Integer> result=sol.preOrderTraversal(root);
//         System.out.println("Iterative prorder traversal:");
//         for(int i=0;i<result.size();i++){
//             System.out.println(result.get(i)+" ");
//         }
//     }
//     static class Node{
//         int val;
//         Node left;
//         Node right;

//         Node(int x){
//             val=x;
//             left=null;
//             right=null;
//         }
//     }
//     static List<Integer> preOrderTraversal(Node root){
//         List<Integer> preOrder=new ArrayList<>();
//         Stack<Node> st=new Stack<>();
//         if(root==null){
//         return preOrder;
//         }
//         st.push(root);
//         while(!st.empty()){
//             root=st.pop();
//             preOrder.add(root.val);
        

//             if(root.right!=null){
//                 st.push(root.right);
//             }
//             if(root.left!=null){
//                 st.push(root.left);
//             }
//         }
//         return preOrder;

//     } 
// }

//Inorder traversal in Binary tree
// public class binaryTree {

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         //intitailise the class
//         binaryTree sol=new binaryTree();
//         //getting proOrder traversal
//         List<Integer> result=sol.preOrder(root);
//         System.out.println("Preorder traversal: ");
//         // for(int i=0;i<result.size();i++){
//         //     System.out.print(result.get(i)+" ");
//         // }

//         for(int val:result){
//             System.out.println(val);
//         }
//     }
//     static class Node{
//         int val;
//         Node left;
//         Node right;

//         Node(int x){
//             val=x;
//             left=null;
//             right=null;
//         }
//     }
//     static List<Integer> preOrder(Node root){
//         List<Integer> pre=new ArrayList<>();
//         Stack<Node> st=new Stack<>();
//         if(root==null){
//             return pre;
//         }
//         //push the root node onto the stack
//         st.push(root);
//         while(!st.empty()){
//             root=st.pop();
//             //add the root node to preoder traversal
//             pre.add(root.val);
        
//         //push the right child onto the stack if exists
//         if(root.right!=null){
//             st.push(root.right);
//         }
//         if(root.left!=null){
//             st.push(root.left);
//         }
//     }
//         return pre;
//     }
// }

// public class binaryTree {

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.right=new Node(4);
//         root.left.right=new Node(5);

//         binaryTree solution=new binaryTree();
//         List<Integer> result=solution.preOrderTraversal(root);
//         System.out.println("Preorder traversal in binary tree:");
//         for(int val:result){
//             System.out.println(val);
//         }

//     }
//     static class Node{
//         int val;
//         Node left;
//         Node right;
//         Node(int x){
//             val=x;
//             left=null;
//             right=null;
//         }
//     }
//     static List<Integer> preOrderTraversal(Node root){
//         List<Integer> pre=new ArrayList<>();
//         Stack<Node> st=new Stack<>();
//         if(root==null){
//             return pre;
//         }
//         st.push(root);
//         while(!st.empty()){
//             root=st.pop();
//             pre.add(root.val);
        
//         if(root.left!=null){
//             st.push(root.left);
//         }
//         if(root.right!=null){
//             st.push(root.right);
//         }
//     }
//     return pre;
//     }
// }

//Inorder traversal in bu=inary tree
// public class binaryTree {

//     public static void main(String[] args) {
//     Node root=new Node(1);
//     root.left=new Node(2);
//     root.right=new Node(3);
//     root.left.left=new Node(4);
//     root.left.right=new Node(5);
    
//     List<Integer> result=InOrder(root);
//     for(int ans:result){
//         System.out.println(ans);
//     }

//     }
//     static class Node{
//         int val;
//         Node left;
//         Node right;

//         Node(int x){
//             val=x;
//             left=null;
//             right=null;
//         }
//     }
//     static List<Integer>InOrder(Node root){
//         List<Integer> arr=new ArrayList<>();
//         Inorder(root,arr);
//         return arr;
//     }
//     static void Inorder(Node root,List<Integer>arr){
//         if(root==null){
//         return;
//         }
//         Inorder(root.left,arr);
//         arr.add(root.val);
//         Inorder(root.right,arr);
//     }
// }

// public class binaryTree {

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         List<Integer> result=Inorder(root);
//         for(int ans:result){
//             System.out.print(ans);
//         }
//     }
//     static List<Integer> Inorder(Node root){
//         List<Integer>arr=new ArrayList<>();
//         inorder(root,arr);
//         return arr;
//     }
//     static void inorder(Node root,List<Integer> arr){
//         if(root==null)
//         return;
//         inorder(root.left, arr);
//         arr.add(root.data);
//         inorder(root.right, arr);
//     }
//     static class Node{
//         int data;
//         Node left;
//         Node right;
        
//         Node(int x){
//             data=x;
//             left=null;
//             right=null;
//         }
//     }
// }

// iterative postorder traversal

public class binaryTree {

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        List<Integer> result=postOrder(root);
        for(int ans:result){
            System.out.println(ans);
        }
    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int x){
            data=x;
            left=null;
            right=null;
        }
    }

    public static List<Integer> postOrder(Node root){
        List<Integer> postorder=new ArrayList<>();
        if(root==null){
            return postorder;
        }
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st1.push(root);
        while(!st1.empty()){
            root=st1.pop();
            st2.push(root);
        
        if(root.left!=null){
            st1.push(root.left);
        }
        if(root.right!=null){
            st1.push(root.right);
        }}
        while(!st2.empty()){
            postorder.add(st2.pop().data);
        }
        return postorder;
    }
}