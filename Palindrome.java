import java.util.*;
class Palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0,r;
    int temp=n;
    while(n>0){
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }
}