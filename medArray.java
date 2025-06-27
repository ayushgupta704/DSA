import java.util.*;

//2 sum problem
// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,3,8,4,7};
//         int n=arr.length;
//         int target=11;
//         int[] ans=twoSum(arr,n,target);
//         System.out.println(ans[0]+","+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;
//     }
// }

// public class medArray{
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14};
//         int n=arr.length;
//         int target=22;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+","+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;
//     }
// }

// import java.util.HashMap;

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12};
//         int n=arr.length;
//         int target=10;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static String twoSum(int arr[],int n,int target){
//         HashMap<Integer,Integer> mpp=new HashMap<>();
//         for(int i=0;i<n;i++){
//             int num=arr[i];
//             int need=target-num;
//             if(mpp.containsKey(need)){
//                 return "Yes";
//             }
//             mpp.put(arr[i],i);
//         }
//         return "NO";
//     }
// }

// import java.util.*;
// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=14;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+","+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             int num=arr[i];
//             int need=target-num;
//             if(map.containsKey(need)){
//                 ans[0]=map.get(need);
//                 ans[1]=i;
//                 return ans;
//             }
//             map.put(arr[i],i);
//         }
//         return ans;
//     } 
// }

//2 sum: brute force

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=13;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static boolean twoSum(int arr[],int n,int target){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//             if(arr[i]+arr[j]==target)
//             return true;
//             }
//         }
//         return false;
//     }
// }


//optimise : hashmap

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=14;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+" ,"+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             int num=arr[i];
//             int need=target-num;
//             if(map.containsKey(need)){
//                 ans[0]=map.get(need);
//                 ans[1]=i;
//                 return ans;
//             }
//             map.put(arr[i],i);
//         }
//         return ans;
//     }
// }


// 2 sum: Two pointer

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,3,5,7};
//         int n=arr.length;
//         int target=14;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static boolean twoSum(int arr[],int n,int target){
//         Arrays.sort(arr);
//         int left=0,right=n-1;
//         while(left<right){
//             int sum=arr[left]+arr[right];
//             if(arr[left]+arr[right]==target)
//             return true;
//             else if(sum<target)
//             left++;
//             else
//             right--;
//         }
//         return false;
//     }
// }


//Majority elements : Brute force

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={3,2,3};
//         int n=arr.length;
//         System.out.println("The majority element is: "+majorElements(arr,n));
//     }
//     static int majorElements(int arr[],int n){
//         int cnt=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i]==arr[j])
//                 cnt++;
//             }
//             if(cnt>n/2)
//             return arr[i];
//         }
//         return -1;
//     }
// }

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14};
//         int n=arr.length;
//         int target=26;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static boolean twoSum(int arr[],int n,int target){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target){
//                 return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14};
//         int n=arr.length;
//         int target=26;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+" "+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }

//         }
//         return ans;
//     }
// }

// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int target=10;
//         int n=arr.length;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+" "+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//             if(arr[i]+arr[j]==target){
//                 ans[0]=i;
//                 ans[1]=j;
//                 return ans;
//             }
//         }
//     }
//         return ans;
//     }
// }



// public class medArray {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=10;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+" "+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         HashMap <Integer,Integer> mpp=new HashMap<>();
       
//         for(int i=0;i<n;i++){
//             int num=arr[i];
//             int need=target-num;
//             if(mpp.containsKey(need)){
//                 ans[0]=mpp.get(need);
//                 ans[1]=i;
//                 return ans;
//             }
//             mpp.put(arr[i],i);
//         }
//         return ans;
//     }
// }


//two pointer 
public class medArray {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        int target=18;
        int ans[]=twoSum(arr,n,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] twoSum(int arr[],int n,int target){
        int left=0,right=n-1;
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                ans[0]=left;
                ans[1]=right;
                return ans;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }

        }
        return ans;
    }
}