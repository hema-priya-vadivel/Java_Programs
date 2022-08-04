import java.util.*;
 class Sum_avg_using_array
 {
   public static void main(String args[])
   {
    
    int arr[]=new int[100];
    System.out.println("Enter the number of array elements: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
         Scanner scan=new Scanner(System.in);
         arr[i]=scan.nextInt();
         scan.close();
    }
    float sum=0;
    float Average=0;
    for(int i=0;i<n;i++){
       sum=sum+arr[i];
       Average=sum/n;
    }
    System.out.println("Sum is " + sum);
    System.out.println("Average is " + Average);  
    sc.close();
   }
  
 }
