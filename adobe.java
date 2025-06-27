import java.util.*;
// public class adobe {

//     public static void main(String[] args) {
//         int arr[]={9,4,6,7,2};
//         int n=arr.length;
//         System.out.println("The largest elemnt in array: "+Sort(arr,n));
//     }
//     static int Sort(int arr[],int n){
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
// }

// Array is sorted or not

//brute force

// public class adobe {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         System.out.println(Sort(arr,n));
//     }
//     static boolean Sort(int arr[],int n){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]>arr[j])
//                 return false;
//             }
//         }
//         return true;
//     }
// }

//
// public class adobe {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         System.out.println(Sort(arr,n));
//     }
//     static boolean Sort(int arr[],int n){
//         for(int i=1;i<n;i++){
//             if(arr[i]<arr[i-1])
//             return false;
//         }
//         return true;
//     }
// }


//Two sum
// public class adobe{
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12};
//         int n=arr.length;
//         int target=22;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static String twoSum(int arr[],int n,int target){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target)
//                 return "YES";
//             }
//         }
//         return "NO";
//     }
// }

public class adobe {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        int n=arr.length;
        int target=22;
        int ans[]=twoSum(arr,n,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] twoSum(int arr[],int n,int target){
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               
                    if(arr[i]+arr[j]==target){
                        ans[0]=i;
                        ans[1]=j;
                        return ans;
                    }
            }
        }
        return ans;
    }
}