// public class recursion {

//     public static void main(String[] args) {
//         print();
//     }
//     static int count=0;
//     static void print(){
//         if(count==5) {
//             return;
//         }
//         System.err.print(count+" ");
//         count=count+1;
//         print();
//     }
// }

// public class recursion {

//     public static void main(String[] args) {
//         func(1,5);
//     }
//     static void func(int i,int n){
//         if(i>5) return;
//         System.out.println("Ayush");
//         func(i+1, n);
//     }
// }

// public class recursion {

//     public static void main(String[] args) {
//         func();
//     }
//     static int cnt=0;
//     static void func(){
//         if(cnt==5) return;
//         System.out.print(cnt);
//         cnt=cnt+1;
//         func();
//     }
// }

// public class recursion {

//     public static void main(String[] args) {
//         func(5, 5);
//     }
//     static void func(int i,int n){
//         if(i<1) return;
//         System.out.println(i);
//         func(i-1, n);
//     }
// }

// public class recursion {

//     public static void main(String[] args) {
//         sum(5);
//     }
//     static void sum(int n){
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum+=i;
//         }
//         System.out.println("The sum of first: "+n+"\n"+"number is "+sum);
//     }
// }

// public class recursion {

//     public static void main(String[] args) {
//         int n=5;
//         sum(n);
//     }
//     static void sum(int n){
//         int cnt=0;
//         for(int i=0;i<=n;i++){
//             cnt+=i;
//         }
//         System.out.println("The sum of first: "+n+"\n"+"number is "+cnt);
//     }
// }


// public class recursion {

//     public static void main(String[] args) {
//         print();
//     }
//     static int crt=0;
//     static void print(){
//         if(crt==5){
//             return;
//         }
//         System.out.println(crt);
//         crt=crt+1;
//         print();
//     }
// }



// public class recursion {

//     public static void main(String[] args) {
//         fun(1,5);
//     }
//     static void fun(int i,int n){
//         if(i>5){
//             return;
//         }
//         System.out.println("Ayush");
//         fun(i+1,n);
//     }
// }


//print no from 1 to n

public class recursion {

    public static void main(String[] args) {
        int n=5;
        printN(n);
    }
    static void printN(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printN(n-1);
    }

}