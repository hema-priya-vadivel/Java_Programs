import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=sc.nextInt();
    System.out.println("Enter the array elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int min=arr[0];
    for(int i=0;i<n;i++){
    if(arr[i]<min){
       min=arr[i];
     }
    }
    System.out.println("The minimum element in an array is:");
    System.out.println(min);
    int max=arr[0];
    for(int i=0;i<n;i++){
    if(arr[i]>max){
       max=arr[i];
     }
    }
    System.out.println("The maximum element in an array is:");
    System.out.println(max);
   }
 }
