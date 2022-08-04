//2nd smallest number in an array

import java.util.*;
 class Second_Smallest
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int temp;
    for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){        
           if(arr[i]<arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
       }
     }
    }
    
    System.out.println(arr[n-2]);
  }
}