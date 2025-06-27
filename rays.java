// import java.util.Arrays;
// //Largest element in the array
// public class rays {
//     public static void main(String[] args) {
//         int arr[]={2,8,5,9,4,10};
//         System.out.println(sort(arr));
//     }
//     static int sort(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length-1];
//     }
// }

import java.util.*;
// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,12,8,4,3};
//         System.out.println(sort(arr));
//     }
//     static int sort(int arr[]){
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max)
//             max=arr[i];
//         }
//         return max;
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,7,4,9,5};
//         int n=arr.length;
//         sort(arr,n);
//     }
//     static void sort(int arr[],int n){
//         int small=arr[1];
//         int large=arr[n-2];
//         System.out.println("Second smallesr no:"+small);
//         System.out.println("Second largest no:"+large);
//         System.out.println(Integer.MAX_VALUE);
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,7,3,6,9,4};
//         int n=arr.length;
//         getElement(arr, n);
//     }
//     static void getElement(int arr[],int n){
//         int small=Integer.MAX_VALUE;
//         int sec_small=Integer.MAX_VALUE;
//         int large=Integer.MIN_VALUE;
//         int sec_large=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             small=Math.min(small,arr[i]);
//             large=Math.max(large, arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]<sec_small && arr[i]!=small){
//                 sec_small=arr[i];
//             }
//             if(arr[i]>sec_large && arr[i]!=large){
//                 sec_large=arr[i];
//             }
//         }
//         System.out.println("Second smallest:"+sec_small);
//         System.out.println("Second largest:"+sec_large);
//     }
// }

//Check if array is Sorted ?

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,5,3,9,7};
//         int n=arr.length;
//         System.out.println(isSorted(arr,n));
//     }
//     static boolean isSorted(int arr[],int n){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[i])
//                 return false;
//             }
            
//         }
//         return true;
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,5,3,9,7};
//         int n=arr.length;
//         System.out.println(isSorted(arr,n));
//     }
//     static boolean isSorted(int arr[],int n){
//         for(int i=1;i<n;i++){
//             if(arr[i]<arr[i-1])
//             return false;
//         }
//         return true;
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,5,3,9,9,7};
//         int k=isDuplicate(arr);
//         System.out.println("The array after removing duplicate elements:");
//         for(int i=0;i<k;i++){
//             System.out.print(arr[i]);
//         }
//     }
//     static int isDuplicate(int arr[]){
//         HashSet <Integer> set=new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             set.add(arr[i]);
//         }
//         int k=set.size();
//         int j=0;
//         for(int x:set){
//             arr[j++]=x;
//         }
//         return k;
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={1,1,2,3,4,4,2};
//         int k=isDuplicate(arr);
//         System.out.println("The element is: ");
//         for(int i=0;i<k;i++){
//             System.out.println(arr[i]);
//         }
//     }
//     static int isDuplicate(int arr[]){
//         int i=0;
//         for(int j=0;j<arr.length;j++){
//             if(arr[i]!=arr[j]){
//                 i++;
//                 arr[i]=arr[j];
//             }
//         }
//         return i+1;
//     }
// }



// Left roatate the array by one 

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         leftRotate(arr,n);
//     }
//     static void leftRotate(int arr[],int n){
//         int temp[]=new int[n];
//         for(int i=1;i<n;i++){
//             temp[i-1]=arr[i];//temp[]={4,6,8,10}
//         }
//         temp[n-1]=arr[0];// temp[4]=2
//         for(int i=0;i<n;i++){//print statement
//             System.out.print(temp[i]+" ");
//         }
//     }
// }


// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         leftRoatate(arr,n);
//     }
//     static void leftRoatate(int arr[],int n){
//         int temp=arr[0];
//         for(int i=0;i<n-1;i++){
//             arr[i]=arr[i+1];
//         }
//         arr[n-1]=temp;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//LeftRoatate the array

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         leftRoatate(arr,n);
//     }
//     static void leftRoatate(int arr[],int n){
//         int temp[]=new int[n];
//         for(int i=1;i<n;i++){
//             temp[i-1]=arr[i];//temp[]={4,6,8,10}
//         }
//         temp[n-1]=arr[0];//temp[4]=2
//         for(int i=0;i<n;i++){
//             System.out.print(temp[i]+" ");
//         }
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         leftRoatate(arr,n);
//     }
//     static void leftRoatate(int arr[],int n){
//         // step1:
//         // int temp[]=new int[n];
//         int temp=arr[0];
//         for(int i=0;i<n-1;i++){
//             arr[i]=arr[i+1];
//         }
//         arr[n-1]=temp;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,0,5,0,9,10};
//         int n=arr.length;
//         int ans[]=removeZero(arr,n);
//         for(int i=0;i<n;i++){
//             System.out.print(ans[i]+" ");
//         }
//         System.out.println();

//     }
//     static int[] removeZero(int arr[],int n){
//         ArrayList<Integer> temp=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0)
//             temp.add(arr[i]);
//         }
//         int nz=temp.size();
//         for(int i=0;i<nz;i++){
//             arr[i]=temp.get(i);
//         }
//         for(int i=nz;i<n;i++){
//             arr[i]=0;
//         }
//         return arr;
//     }

// }


// public class rays {

//     public static void main(String[] args) {
//         int arr[]={1,2,0,3,0,4,5,0,9};
//         int n=arr.length;
//         int ans[]=moveZero(arr,n);
//         for(int i=0;i<n;i++){
//             System.out.print(ans[i]+" ");
//         }
//         System.out.println();
//     }
//     static int[] moveZero(int arr[],int n){
//         ArrayList<Integer> temp=new ArrayList<>();
//         //copy non zero element from original to temp array
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0)
//             temp.add(arr[i]);
//         }
//         int nz=temp.size();
//         for(int i=0;i<nz;i++){
//             arr[i]=temp.get(i);
//         }
//         for(int i=nz;i<n;i++){
//             arr[i]=0;
//         }
//         return arr;
//     }
// }

// public class rays {

//     public static void main(String[] args) {
//         int arr[]={1,2,0,3,0,4,5,0,9};
//         int n=arr.length;
//         int ans[]=moveZero(arr,n);
//         for(int i=0;i<n;i++){
//             System.out.print(ans[i]+" ");
//         }
//         System.out.println();
//     }
//     static int[] moveZero(int arr[],int n){
//         int j=-1;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 j=i;
//                 break;
//             }
//         }
//         if(j==-1)
//         return arr;
//         for(int i=j+1;i<n;i++){
//             if(arr[i]!=0){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 j++;
//             }
//         }
//         return arr;
//     }
    
// }

public class rays {

    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,4,5,0,7,0,9};
        int n=arr.length;
        int ans[]=moveZero(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    static int[] moveZero(int arr[],int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)
        return arr;

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}