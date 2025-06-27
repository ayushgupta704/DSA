// import java.util.Arrays;
import java.util.*;
// public class flipkart {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,12,10};
//         int n=arr.length;
//         System.out.println(Lelement(arr,n));
//     }
//     static int Lelement(int arr[],int n){
//         Arrays.sort(arr);
//         return arr[n-1];
//     }
// }

//optimise
// public class flipkart {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,12,7,3};
//         int n=arr.length;
//         System.out.println(Lelement(arr,n));
//     }
//     static int Lelement(int arr[],int n){
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
// }

// public class flipkart {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,12,7,3};
//         int n=arr.length;
//         System.out.println(secLarge(arr,n));
//     }
//     static int secLarge(int arr[],int n){
//         Arrays.sort(arr);
//         return arr[n-2];
//     }
// }

// public class flipkart {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,12,7,3};
//         int n=arr.length;
//         secLarge(arr,n);
//     }
//     static void secLarge(int arr[],int n){
//         int small=Integer.MAX_VALUE;
//         int secSmall=Integer.MAX_VALUE;
//         int large=Integer.MIN_VALUE;
//         int seclarge=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             small=Math.min(small,arr[i]);
//             large=Math.max(large,arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]<secSmall && arr[i]!=small){
//                 secSmall=arr[i];
//             }
//             if(arr[i]>seclarge && arr[i]!=large){
//                 seclarge=arr[i];
//             }
           
//         }
//         System.out.println(secSmall);
//         System.out.println(seclarge);
     
//     }
// }

// public class flipkart {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,1};
//         int n=arr.length;
//         System.out.println(isSort(arr,n));
//     }
//     static boolean isSort(int arr[],int n){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]>arr[j])
//                 return false;
//             }
//         }
//         return true;
//     }    
// }

// public class flipkart {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         System.out.println(isSort(arr,n));
//     }
//     static boolean isSort(int arr[],int n){
//         for(int i=1;i<n;i++){
//             if(arr[i]<arr[i-1]){
//             return false;
//             }
//         }
//         return true;
//     }
// }

//remove duplicate 

// public class flipkart {

//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,2,3,3};
//         int n=arr.length;
//         int k=duplicate(arr,n);
//         for(int i=0;i<k;i++){
//             System.out.println(arr[i]);
//         }
//     }
//     static int duplicate(int arr[],int n){
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<n;i++){
//             set.add(arr[i]);
//         }
//         int k=set.size();
//         int j=0;
//         for(int i=0;i<n;i++){
//             if(set.contains(arr[i])){
//                 arr[j++]=arr[i];
//                 set.remove(arr[i]);
//             }
//         }
//         return k;
//     }
// }

//optimise : two pointer

// public class flipkart {

//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,2,3,3,3,4};
//         int n=arr.length;
//         int k=duplicate(arr,n);
//         for(int i=0;i<k;i++){
//             System.out.println(arr[i]);
//         }
//     }
//     static int duplicate(int arr[],int n){
//         int i=0;
//         for(int j=1;j<n;j++){
//             if(arr[i]!=arr[j]){
//                 i++;
//                 arr[i]=arr[j];
              
//             }
//         }
//         return i+1;
//     }
// }

//TWO sum

//brute force

// public class flipkart {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=180;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static String twoSum(int arr[],int n,int target){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target){
//                     return "Yes";
//                 }
//             }
//         }
//           return "NO";
//     }
// }

//optimise

// public class flipkart {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=14;
//         int ans[]=twoSum(arr,n,target);
//         System.out.println(ans[0]+" "+ans[1]);
//     }
//     static int[] twoSum(int arr[],int n,int target){
//         HashMap<Integer,Integer>set=new HashMap<>();
//         int ans[]=new int[2];
//         ans[0]=ans[1]=-1;
//         for(int i=0;i<n;i++){
//             int sum=arr[i];
//             int moreNeed=target-sum;
//             if(set.containsKey(moreNeed)){
//                 ans[0]=set.get(moreNeed);
//                 ans[1]=i;
//                 return ans;
//             }
//             set.put(arr[i], i);
//         }
//         return ans;
//     }
// }

// public class flipkart {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int n=arr.length;
//         int target=17;
//         System.out.println(twoSum(arr,n,target));
//     }
//     static boolean twoSum(int arr[],int n,int target){
//         int low=0,high=n-1;
//         while(low<=high){
//             int sum=arr[low]+arr[high];
//             if(sum==target){
//                 return true;
//             }
//             else if(sum<target){
//                 low++;
//             }
//             else{
//                 high--;
//             }
//         }
//         return false;
//     }
// }


