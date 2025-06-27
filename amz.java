//Brute force

// public class amz {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=13;
//         System.out.println(twoSum(arr,n,target));
//     }    
//     static boolean twoSum(int arr[],int n,int target){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target)
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// import java.util.*;

// public class amz {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=10;
//         System.out.println(search(arr,n,target));
//     }
//     static boolean search(int arr[],int n,int target){
//         HashMap<Integer,Integer> mpp=new HashMap<>();
//         for(int i=0;i<n;i++){
//             int num=arr[i];
//             int need=target-num;
//             if(mpp.containsKey(need)){
//                 return true;
//             }
//             mpp.put(arr[i],i);
//         }
//         return false;
//     }
// }

// public class amz {

//     public static void main(String[] args) {
//         HashMap<String,Integer> mpp=new HashMap<>();
//         mpp.put("Ayush",1);
//         mpp.put("Lakshay",2);
//         mpp.put("Mayank",3);
//         mpp.put("Vivek",4);
//         System.out.println(mpp.containsKey("Lakshay"));
//         System.out.println(mpp.size());
//         System.out.println(mpp.get("Mayank"));
//         System.out.println(mpp.remove("Vivek",4));
//         System.out.println(mpp.size());
//         System.out.println(mpp);
//         for(String i:mpp.keySet()){
//             System.out.println(i);
//         }
//     }
// }



// public class amz {

//     public static void main(String[] args) {
//         HashMap <String,Integer> mpp=new HashMap<>();
//         mpp.put("Ayush",1);
//         mpp.put("Surbhi", 2);
//         mpp.put("Shagun",3);
//         System.out.println(mpp);
//         System.out.println(mpp.containsKey("Surbhi"));
//         System.out.println(mpp.get("Ayush"));
//         System.out.println(mpp.size());
//         System.out.println(mpp.remove("Shagun",3));
//         System.out.println(mpp);
//         for(String i:mpp.keySet()){
//             System.out.println(i);
//         }
//     }
// }



// import java.util.*;
// public class amz {

//     public static void main(String[] args) {
//         String str1="INTEGER";
//         String str2="TEGERNI";
//         System.out.println(Anagram(str1,str2));
//     }
//     static String sortString(String str){
//         char st[]=str.toCharArray();
//         Arrays.sort(st);
//         return new String(st);
//     }
//     static boolean Anagram(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         str1=sortString(str1);
//         str2=sortString(str2);
//         for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }

// }


// import java.util.*;
// public class amz {

//     public static void main(String[] args) {
//         String str1="Ayush";
//         String str2="hsuyA";
//         System.out.println(Anagram(str1,str2));
//     }
//     static String sortString(String str){
//         char st[]=str.toCharArray();
//         Arrays.sort(st);
//         return new String(st);
//     }
//     static boolean Anagram(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         str1=sortString(str1);
//         str2=sortString(str2);

//         for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }

// }

import java.util.*;
// public class amz {

//     public static void main(String[] args) {
//         String str1="HELLO";
//         String str2="OLLEH";
//         System.out.println(Anagram(str1,str2));
//     }
//     static boolean Anagram(String str1,String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         int freq[]=new int[26];
//         for(int i=0;i<str1.length();i++){
//             freq[str1.charAt(i)-'A']++;
//         }
//         for(int i=0;i<str2.length();i++){
//             freq[str2.charAt(i) -'A']--;
//         }
//         for(int i=0;i<26;i++){
//             if(freq[i]!=0){
//             return false;
//             }
//         }
//         return true;
//     }
// }


// public class amz {
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int key){
//             data=key;
//             left=null;
//             right=null;
//         }
//     }
//      public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.right.left=new Node(5);
//     }
// }


// public class amz {

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.right=new Node(4);
//     }
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int key){
//             data=key;
//             left=null;
//             right=null;
//         }
//     }
// }

//preoreder
// void preoreder(Node){
//     if(Node==null)
//     return;
//     print(Node -> data);
//     preoreder(Node -> left);
//     preoreder(Node -> right);

// }


// public class amz {

//     public static void main(String[] args) {
//         //create simple binary tree
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         //call preorder traversal

//         List <Integer> result=preOrder(root);
        
//         //Display preorder result
//         System.out.println("preorder:");
        
//         //output at each traversal
//         for(int val:result){
//             System.out.println(val);
//         }
//         System.out.println();
//     }
//     static List<Integer> preOrder(Node root){

//         //create a empty list to store preoreder values
//         List<Integer> arr=new ArrayList<>();
//         preOrder(root,arr);
//         return arr;
//     }
//     static void preOrder(Node root,List<Integer> arr){
//         if(root==null){
//             return;
//         }
//         arr.add(root.data);
//         preOrder(root.left,arr);
//         preOrder(root.right,arr);
//     } 
// }


// public class amz {

//     public static void main(String[] args) {
//         //simple binary tree
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);

//         List <Integer> result=preOrder(root);
//         System.out.println("preorder:");
        
//         //output at each traversal
//         for(int val:result){
//             System.out.println(val);
//         }
//         System.out.println();

//     }
//     static List<Integer> preOrder(Node root){
//         List<Integer> arr=new ArrayList<>();
//         preOrder(root,arr);
//         return arr;
//     }
//     static void preOrder(Node root,List <Integer> arr){
//         if(root==null){
//             return;
//         }
//         arr.add(root.data);
//         preOrder(root.left,arr);
//         preOrder(root.right,arr);
//     }
// }



public class amz {

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        List <Integer> result=preOrder(root);
        System.out.println("Preorder: ");
        for(int val:result){
            System.out.println(val);
        }
        System.out.println();
    }
    static class Node{
        //Node class for binary tree
        int data;
        Node left;
        Node right;
        
        //constructor to initalise the node with a value

        Node(int val){
            data=val;
            left=null;
            right=null;
        }

    }
    static List<Integer> preOrder(Node root){
        List <Integer> arr=new ArrayList<>();
        preOrder(root,arr);
        return arr;
    }
    static void preOrder(Node root,List <Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        preOrder(root.left,arr);
        preOrder(root.right,arr);
    }
}