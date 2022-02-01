import java.util.*;
class FibonacciRecursion{
  static int n1=0,n2=1;
  static void Recursion(int n){
    if(n>0){
    int n3=n1+n2;
    n1=n2;
    n2=n3;
    System.out.println(" "+n3);
    Recursion(n-1);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements needed in Fibonacci series");    
    int n=sc.nextInt();
    System.out.println(" "+n1+"\n"+" "+n2);
    Recursion(n-2);
  }
}