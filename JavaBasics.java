// // // import java.util.*;
// // // public class JavaBasics{
// // //     public static void  swap(int a,int b){
// // //         int temp = a;
// // //         a = b;
// // //         b= temp;
// // //         System.out.println(a);
// // //         System.out.println(b);

// // //     }
// // //     public static void main(String args[]){
// // //         // int a =5;
// // //         // int b =6;
// // //         // swap(a,b);


// // //         int a =10;
// // //         int b =70;
// // //         swap(a,b);
// // //     }
// // // }

// // // import java.util.*;
// // // public class JavaBasics{
// // //     public static int product(int a, int b){
// // //         int mul = a*b;
// // //         return mul;

// // //     }
// // //     public static void main(String args[]){
// // //         int a =5;
// // //         int b =6;
// // //         int prod1 = product(a,b);
// // //         System.out.println(prod1);
// // //     }

// // // }


// // // import java.util.*;
// // // public class JavaBasics{
// // //     public static int factorial(int n){
// // //         int f = 1;
// // //         for (int i=1; i<=n; i++){
// // //             f=f*i;
// // //         }
// // //     return f;
// // //     }

// // //     public static int binocoeff(int n,int r){
// // //         int fac_n = factorial(n);
// // //         int fac_r = factorial(r);
// // //         int facr_nmr = factorial(n-r);

// // //         int binocoeff = fac_n/(fac_r*facr_nmr);
// // //         return binocoeff;
// // //     }

// // //     public static void main(String args[]){
// // //         System.out.println(binocoeff(5, 2));
// // //     }
// // // }


// // // import java.util.*;
// // // public class JavaBasics{
// // //     public static int sum(int a,int b){
// // //         return a+b;
// // //     }
// // //     public static int sum(int a,int b,int c){
// // //         return a+b+c;
// // //     }

// // //     public static void main(String args[]){
// // //         System.out.println(sum(4, 6));
// // //         System.out.println(sum(2, 3, 4));
// // //     }
// // // }

// // // import java.util.*;
// // // public class JavaBasics{
// // //     public static boolean prime(int n){
// // //         if(n==2){
// // //              return true;
// // //         }
// // //         for(int i=2; i<=n-1;i++){
// // //             if(n % i==0) {
// // //                return false;
// // //             }
// // //         }
// // //         return true;
// // //     }
// // //     public static void main(String args[]){
// // //         System.out.println(prime(2));
// // //     }
// // // }

// // import java.util.*;
// // // public class JavaBasics{
// // //     public static boolean prime(int n){
// // //         if (n==2){
// // //             return true;
// // //         }
// // //         for(int i=2;i<=n-1;i++){
// // //             if(n%i==0){
// // //                 return false;
// // //             }
// // //         }
// // //         return true;
// // //     }
// // //     public static void main(String args[]){
// // //         System.out.println(prime(3));
// // //     }
// // // }

// // // public class JavaBasics{
// // //     // public static boolean prime(int n){
// // //     //     if (n==2){
// // //     //         return true;
// // //     //     }
// // //     //     for(int i=2;i<=Math.sqrt(n);i++){
// // //     //         if(n%i==0){
// // //     //             return false;
// // //     //         }
// // //     //     }
// // //     //     return true;

// // //     // }
// // //     // public static void main(String args[]){
// // //     //     System.out.println(prime(4));
// // //     // }



// // //     public static boolean prime(int n){
// // //         if (n==2){
// // //             return true;
// // //         }
// // //         for (int i=2;i<=n-1;i++){
// // //             if(n%i==0){
// // //                 return false;
// // //             }
// // //         }
// // //         return true;
// // //     }
// // //     public static void range(int n){
// // //         for (int i=2;i<=n;i++){
// // //             if(prime(i)) {
// // //                 System.out.println(i+" ");
// // //             }
// // //         }
// // //         System.out.println();
// // //     }

// // //     public static void main(String args[]){
// // //         range((20));
// // //     }
// // // }



// // import java.util.*;
// // public class JavaBasics{
// //     public static boolean prime(int n){
// //         if(n==2){
// //             return true;
// //         }
// //         for (int i=2;i<=Math.sqrt(n);i++){
// //             if(n%i==0){
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }

// //     public static void range(int n){
// //         for(int i=2;i<=n;i++){
// //             if (prime(i)){
// //                 System.out.println(i);
// //             }
// //         }
// //     }


// //     // public static void bintodeci(int n){
// //     //     int mynum = n;
// //     //     int pow = 0;
// //     //     int decnum = 0;
// //     //     while(n>0){
// //     //         int ld = n%10;
// //     //         decnum = decnum+(ld*(int)Math.pow(2,pow));
// //     //         pow++;
// //     //         n = n/10;
// //     //     }

// //     //     System.out.println(mynum);
// //     //     System.out.println(decnum);

// //     // }

// // }
// // import java.util.*;
// // public class JavaBasics{

// //     public static int bintodec(int n){
// //         int pow = 1;
// //         int decnum = 1;
// //         int mynum = binnum;

// //         while(n>0){
// //             int lastdigit = n%10;
// //             decnum = decnum+(lastdigit*(int)Math.pow(2,pow));
// //             pow++;
// //             n = n/10;
// //         }

// //         System.out.println(mynum);
// //         System.out.println(decnum);
// //     }
// //     public static void main(String args[]){
// //         bintodec(1);

// //     }
// // }


// // import java.util.*;
// // public class JavaBasics{
// //     public static void main(String args[]){
// //         int marks[] = new int [100];
// //         System.out.println("length of array="+marks.length);

// //         Scanner sc = new Scanner(System.in);


// //         marks[0] = sc.nextInt();
// //         marks[1] = sc.nextInt();
// //         marks[2] = sc.nextInt();

// //         System.out.println("phy :" +marks[0]);
// //         System.out.println("chem :" +marks[1]);
// //         System.out.println("math :" +marks[2]);


// //         marks[2] = 100;
// //         System.out.println("math :" +marks[2]);
// //         marks[2]=marks[2]+1;
// //         System.out.println("math :" +marks[2]);
// //         int percentage = (marks[0]+marks[1]+marks[2]/3);
// //         System.out.println("percentage = "+percentage+"%");
// //     }
// // }


// // 


// // 


// // import java.util.*;
// // public class JavaBasics{

// //     public static int arr(int number[]){
// //         int myarr[]=new int[50];
// //         return arr;
// //     }

// //     public static void main(String args[]){
// //         System.out.println(arr())

// //     }
// // }

// // 
// // import java.util.*;
// // public class JavaBasics{
// //     public static int myarr(int number[],int key ){
// //         for(int i=0;i<number.length;i++){
// //             if(number[i]==key){
// //                 return i ;
// //             }
// //         }
// //         return -1;
// //     }

// //     public static void main(String args[]){
// //         int number[] = {2,3,4,5,6,7,8,9};
// //         int key = 5;
// //         int index = myarr(number,key);

// //         if (index==-1){
// //             System.out.println("not found");

// //         }
// //         else{
// //             System.out.println("the index is found:"+index);
// //         }
    
// //     }
// // }

// // 

// // import java.util.*;
// // public class JavaBasics{
// //     public static int myarr(int numbers[],int key){
// //         for(int i =0;i<numbers.length;i++){
// //             if (numbers[i]==key){
// //                 return i;
// //             }
// //         }
// //         return -1;
// //     }
// //     public static int largest(int numbers[]){
// //         int largest = Integer.MIN_VALUE;
// //         for(int i= 0;i<numbers.length;i++){
// //             if(largest<numbers[i]){
// //                 largest=numbers[i];
// //             }
// //         }
// //         return largest;
// //     }
// //     public static void main(String args[]){
// //         int numbers[] = {1,2,3,4,5,6,7,8,99,90,78,97};
// //         int key = 6;
// //         int index = myarr(numbers, key);
// //         if(index==-1){
// //             System.out.println("not found");
// //         }
// //         else{
// //             System.out.println("the index is found:"+index);
// //         }

// //         System.out.println("the largest number is:"+largest(numbers));
// //     }
// // }

// // import java.util.*;
// // public class JavaBasics{
// //     public static int myarr(int numbers[],int key){
// //         for(int i =0;i<numbers.length;i++){
// //             if(numbers[i]==key){
// //                 return i;
// //             }
// //         }

// //         return -1;

// //     }

// //     public static int largest(int numbers[]){
// //         int largest = Integer.MIN_VALUE;
// //         int smallest = Integer.MAX_VALUE;
// //         for(int i=0;i<numbers.length;i++){
// //             if(largest<numbers[i]){
// //                 largest = numbers[i];
// //             }
// //             if(smallest>numbers[i]){
// //                 smallest = numbers[i];
// //             }

// //             System.out.println("the smallest number is:"+smallest);
            
// //         }
// //         return largest;
// //     }

// //     public static void main(String args[]){
// //         int numbers[]={1,2,3,3,44,55,66,7,8,9,0};
// //         int key = 7;
// //         System.out.println("the number is:"+largest(numbers));
// //     }

// // }


// // import java.util.*;
// // public class JavaBasics{
// //     public static int binarysearch(int numbers[],int key){
// //        int start=0;
// //        int end = numbers.length-1;

// //        while(start<= end){
// //         int mid = (start+end)/2;

// //         if(numbers[mid]==key){
// //             return mid;
// //         }
// //         if(numbers[mid]<key){
// //             start=mid+1;
// //         }else{
// //             end = mid-1;
// //         }
// //        }
// //      return -1;

// //     }

// //     public static void main(String args[]){
// //         int numbers[]={1,2,3,4,5,6,7,8,9,10};
// //         int key = 6;
// //         System.out.println(binarysearch(numbers, key));
// //     }
// // }

// // import java.util.*;
// // public class JavaBasics{
// //     public static int bs(int numbers[],int keys){
// //         int start = 0;
// //         int end = numbers.length-1;
// //         int mid = (start+end)/2;
        

// //         while(start<=end){
// //            // int mid = (start+end)/2;
// //             if(numbers[mid]==keys){
// //                 return mid;
// //             }
// //             if(numbers[mid]<keys){
// //                 start = mid+1;
// //             }else{
// //                 end = mid-1;
// //             }
// //         }
// //         return -1;
// //     }



// //     public static void main(String args[]){
// //         int numbers[]={1,2,3,4,5,6,7,8,9,999};
// //         int keys = 5;
// //         System.out.println("the number is:"+bs(numbers, keys));

// //     }
// //}

// // import java.util.*;
// // public class JavaBasics{
// //     public static void  print(int arr[]){
// //         for (int i=0;i<arr.length;i++){
// //             System.out.println(arr[i]);
// //         }
// //         System.out.println();

// //     }

// //     public static void mergesort(int arr[],int start,int end){
// //         if(start>=end){
// //             return;
// //         }
// //         int mid = (start+end)/2;
// //         mergesort(arr, start, mid);
// //         mergesort(arr, mid+1, end);
// //         merge(arr,start,end,mid);
// //     }

// //     public static void merge(int arr[],int start,int end,int mid){
// //         int temp[] = new int[end-start+1]; ///kyuki zero se start hota hai
// //         int i = start;
// //         int j= mid+1;
// //         int k = 0;

// //         while(i<=mid && j<=end){
// //             if(arr[i]<arr[j]){
// //              temp[k] =arr[i];
// //              i++;
// //             }
// //             else{
// //                 temp[k]=arr[j];
// //                 j++;
// //             }
// //             k++;

// //         }

// //         while(i<=mid){
// //             temp[k++] = arr[i++];
// //         }

// //         while(j<=end){
// //             temp[k++] = arr[j++];
// //         }

// //         for(k=0,i=start ; k<temp.length;k++,i++){
// //             arr[i]=temp[k];
// //         }
        
// //     }
// //     public static void main(String args[]){
// //         int arr []={6,3,9,5,2,8};
// //         mergesort(arr,0, arr.length-1);
// //         print(arr);
// //     }
// // }


// // import java.util.*;
// // public class JavaBasics{
// //     public static void print(int arr[]){
// //         for(int i=0;i<arr.length;i++){
// //             System.out.println(arr[i]);
// //         }
// //         System.out.println();
// //     }

// // //     public static void mergesort(int arr[],int start,int end){
// // //         if(start>=end){
// // //             return;
// // //         }
// // //         int mid = (start+end)/2;
// // //         mergesort(arr,start,mid);
// // //         mergesort(arr,mid+1,end);
// // //         merge(arr,start,end,mid);
// // //     }

// // //     public static void merge(int arr[],int start,int end,int mid){
// // //         int temp[] = new int [end -start+1];
// // //         int i = start;
// // //         int j = mid+1;
// // //         int k = 0;

// // //         while(i<=mid&&j<=end){
// // //             if(arr[i]<arr[j]){
// // //                 temp[k]=arr[i];
// // //                 i++;
// // //             }
// // //             else{
// // //                 temp[k] = arr[j];
// // //                 j++;
// // //             }
// // //             k++;
// // //         }
// // //         while(i<=mid){
// // //             temp[k++] = arr[i++];
// // //         }
// // //         while(j<=end){
// // //             temp[k++] = arr[j++];
// // //         }
// // //         for(k=0,i=start;k<temp.length;k++,i++){
// // //             arr[i]=temp[k];
// // //         }

// // //     }

// // //     public static void main(String args[]){
// // //         int arr[] = {6,3,9,5,2,8};
// // //         mergesort(arr,0,arr.length-1);
// // //         print(arr);
        
// // //     }
// // // }


// import java.util.Arrays;
// import java.util.Collections;
// import java.utl.*;
// public class JavaBasics{

//     public static void arr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println()
//     }
//     public static void main(String args[]){
//         Integer arr[] = {1,5,4,6,3,2};
//        Arrays.sort(arr,Collections.reverseOrder());
//        println(arr);
//     }

// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs();

//     }
// }


// class Animal{
//     String color;

//     void eat() {
//         System.out.println("eat");
//     }

//     void breathe(){
//         System.out.println("breathe");
//     }
// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("swim");
//     }
// }

// class Mammals extends fish{
//     void legs(){
//         System.out.println("legs");
//     }
// }

// class Dog extends Mammals{

// }

// import java.util.*;

// class JavaBasics {
//     public static void main(String args[]) {
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs();
//     }
// }

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eat");
//     }

//     void breathe() {
//         System.out.println("breathe");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("swim");
//     }
// }

// class Mammals extends Fish {
//     void legs() {
//         System.out.println("legs");
//     }
// }

// class Dog extends Mammals {
// }

import java.util.*;
public class JavaBasics{
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i<=n; i++){
            f=f*i;
        }
        return f;
        
    }
    public static void main(String args[]){
        System.out.println(factorial(4));
    }
}

