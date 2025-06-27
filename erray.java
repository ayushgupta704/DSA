import java.util.*;
// public class erray {

//     public static void main(String[] args) {
//         int arr[]={9,3,5,6,8,2,1};
//         int n=arr.length;
//         System.out.println("The largest element is: "+getElement(arr, n));
//     }
//     static int getElement(int arr[],int n){
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max)
//             max=arr[i];
//         }
//         return max;
//     }
// }

//Sort the array
// public class erray {

//     public static void main(String[] args) {
//         int arr[]={9,5,7,3,2,5};
//         int n=arr.length;
//         System.out.println(getElement(arr, n));
//     }
//     static boolean getElement(int arr[],int n){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]>arr[j])
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// public class erray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,1};
//         int n=arr.length;
//         System.out.println(getElement(arr,n));
//     }
//     static boolean getElement(int arr[],int n){
//         for(int i=1;i<n;i++){
//             if(arr[i]<arr[i-1])
//             return false;
//         }
//         return true;
//     }
// }


//Last element in the array

// public class erray {

//     public static void main(String[] args) {
//         int arr[]={2,4,1,9,6,8};
//         int n=arr.length;
//         System.out.println(lastElement(arr,n));
//     }
//     static int lastElement(int arr[],int n){
//         Arrays.sort(arr);
//         return arr[n-1];
//     }
// }

// public class erray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,2};
//         int n=arr.length;
//         System.out.println(getElement(arr,n));
//     }
//     static int getElement(int arr[],int n){
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max)
//             max=arr[i];
//         }
//         return max;
//     }
// }

// public class erray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         System.out.println(getElement(arr,n));
//     }
//     static boolean getElement(int arr[],int n){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]>arr[j])
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// public class erray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         System.out.println(getElement(arr,n));
//     }
//     static boolean getElement(int arr[],int n){
//         for(int i=1;i<n;i++){
//             if(arr[i]<arr[i-1])
//             return false;
//         }
//         return true;
//     }
// }

// 2 sum problem
public class erray {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int n=arr.length;
        int target=21;
        System.out.println(getElement(arr,n,target));
    }
    static boolean getElement(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)
                return true;
            }
        }
        return false;
    } 
}


// Largest and secLargest
