import java.util.*;

 class AscendingDescending
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
 
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    } 
    for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
      int temp=0;
     if(arr[i]>arr[j]){
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
    }
    System.out.println("Ascending order:"+arr[i]);
   }
   
   for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
      int temp=0;
     if(arr[i]<arr[j]){
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
    }
    System.out.println("Descending Order: "+arr[i]);
   }
    
   }
 }
