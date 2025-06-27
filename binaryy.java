// public class binaryy {
//     public static void main(String[] args) {
//         int arr[]={3, 4, 6, 7, 9, 12, 16, 17};
//         int n=arr.length;
//         int target=12;
//         System.out.println(searchBinary(arr,n,target));
//     }
//     static int searchBinary(int arr[],int n,int target){
//         int low=0,high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]==target)
//             return mid;
//             else if(target>arr[mid])
//             low=mid+1;
//             else
//             high=mid-1;
//         }
//         return -1;
//     }
// }


//recursive approach

// public class binaryy {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int target=10;
//         int n=arr.length;
//         int low=0,high=n-1; 
//         int result=searchBinary(arr,low,high,target);
//         if(result==-1){
//             System.out.println("Target not found");
//         }
//         else{
//             System.out.println("Target found: "+result);
//         }
//     }
//     static int searchBinary(int arr[],int low,int high,int target){
//         if(low>high)
//         return -1;
//         int mid=(low+high)/2;
//         if(arr[mid]==target)
//         return mid;
//         else if(arr[mid]<target){
//         return searchBinary(arr, mid+1, high, target);
//         }
//         else{
//         return searchBinary(arr, low,mid-1, target);
//         }
//     }
// }

// public class binaryy {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14};
//         int n=arr.length;
//         int low=0,high=n-1;
//         int target=12;
//         System.out.println(searchBinary(arr,low,high,target));
//     }
//     static int searchBinary(int arr[],int low,int high,int target){
//             if(low>high){
//                 return -1;
//             }
//             int mid=(low+high)/2;
//             if(arr[mid]==target)
//             return mid;
//             else if(arr[mid]<target)
//             return searchBinary(arr,mid+1, high, target);
//             else
//             return searchBinary(arr, low,mid-1, target);
        
//     }
// }

// Lower Bound

// public class binaryy {

//     public static void main(String[] args) {
//         int arr[]={3,5,8,13,15,19};
//         int n=arr.length;
//         int x=14;
//         System.out.println(lowerBound(arr,n,x));
//     }
//     static int lowerBound(int arr[],int n,int x){
//         for(int i=0;i<n;i++){
//             if(arr[i]>=x)
//             return i;
//         }
//         return x;
//     }
// }

