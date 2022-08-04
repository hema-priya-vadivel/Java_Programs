import java.util.*;

public class SelectionSortMin{
    public static void main(String[] args){
      System.out.println("Enter the number of array elements: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Enter the array elements: ");
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      selection(arr);
      System.out.println("The elements in sorted order using Selection Sort :");
      System.out.println(Arrays.toString(arr));
    sc.close();
  }

  static void selection(int arr[]){
    for(int i=0;i<arr.length;i++){
      int last=arr.length-i-1;
      int minIndex=getMinIndex(arr,0,last);
      swap(arr,minIndex,last);
    }
}


 static void swap(int arr[],int first,int second){
      int temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
    }
    
    static int getMinIndex(int arr[],int start,int end){
      int min=start;
      for(int i=start;i<=end;i++){
        if(arr[min]<arr[i]){
          min=i;
        }
      }
    return min;
    }
    }