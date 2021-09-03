import java.util.*;

 class OddEvenPosition
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Odd position numbers are:");    for(int i=0;i<n;i+=2){
      int odd= arr[i];
      System.out.println(odd);  
    }
    System.out.println("Even position numbers are:");
    for(int i=1;i<n;i+=2){
      int even= arr[i];
      System.out.println(even);  
    }
    
   }
 }