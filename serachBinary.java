// public class serachBinary {

//     public static void main(String[] args) {
//         int arr[]={3,4,6,7,9,12,16,17};
//         int target=99;
//         int res=search(arr,target);
//         if(res==-1){
//             System.out.print("The target is not present.");
//         }
//         else{
//             System.out.print("The target is at index: "+res);
//         }
//     }
//     static int search(int arr[],int target){
//         int n=arr.length;
//         int low=0,high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(target==arr[mid])
//             return mid;
//             else if(target>arr[mid])
//             low=mid+1;
//             else
//             high=mid-1;
//         }
//         return -1;
//     }
// }

// public class serachBinary {

//     public static void main(String[] args) {
//         int arr[]={3,5,8,15,19};
//         int n=arr.length;
//         int x=9;
//         int result=search(arr,n,x);
//         System.out.println("The lower bound is: "+result);
//     }
//     static int search(int arr[],int n,int x){
//         for(int i=0;i<n;i++){
//             if(arr[i]>=x)
//             return i;
//         }
//         return n;
//     }
// }

//optimise version using two pointer
// public class serachBinary {

//     public static void main(String[] args) {
//         int arr[]={3,5,8,15,19};
//         int n=arr.length;
//         int x=9;
//         System.out.print("The lower bound at index: "+search(arr,n,x));
//     }
//     static int search(int arr[],int n,int x){
//         int low=0;
//         int high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]>=x){
//                 high=mid-1;
//                 return mid;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return -1;
//     }
// }


public class serachBinary {

    public static void main(String[] args) {
        int arr[]={3,5,8,15,19};
        int n=arr.length;
        int x=9;
        System.out.println(search(arr,x,n));
    }
    static int search(int arr[],int x,int n){
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                return i;
            }
        }
        return n;
    }
}