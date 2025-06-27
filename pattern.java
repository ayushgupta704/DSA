import java.util.Scanner;

// public class pattern {

//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=input.nextInt();
//         pattern1(n);
//     }
//     static void pattern1(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=input.nextInt();
//         pattern2(n);
//     }
//     static void pattern2(int n){
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern3(n);
//     }
//     static void pattern3(int n){
//         for(int i=1;i<n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern4(n);
//     }
//     static void pattern4(int n){
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern5(n);
//     }
//     static void pattern5(int n){
//         for(int i=0;i<n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern6(n);
//     }
//     static void pattern6(int n){
//         for(int i=0;i<n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print(n-j+1);
//             }
//             System.out.println();
//         }
//     }
// }


// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern7(n);
//     }
//     static void pattern7(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*i+1;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern8(n);
//     }
//     static void pattern8(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<2*n-(2*i+1);j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern9(n);
//     }
//     static void pattern9(int n){
//         for (int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         patetrn2(n);
//     }
//     static void patetrn2(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern3(n);
//     }
//     static void pattern3(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=6;
//         pattern4(n);
//     }
//     static void pattern4(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=input.nextInt();
//         pattern1(n);
//     }
//     static void pattern1(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n=input.nextInt();
//         pattern2(n);
//     }
//     static void pattern2(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         pattern3(n);
//     }
//     static void pattern3(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         pattern4(n);
//     }
//     static void pattern4(int n){
//         for(int i=0;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         pattern5(n);
//     }
//     static void pattern5(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print(n-j+1);
//             }
//             System.out.println();
//         }
//     }
// }

public class pattern {

    public static void main(String[] args) {
        int n=5;
        pattern6(n);
    }
    static void pattern6(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("#");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("#");
            }
            System.out.println();
        }
       
    }
}