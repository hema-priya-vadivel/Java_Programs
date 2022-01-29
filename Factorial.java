import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element");
    int n=sc.nextInt();
    int fact=1;
    if(n==0){
      System.out.println("1");
    }
    else{
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println("The factorial of a given element is:");
    System.out.println(fact);
    }
   }
 }
