import java.util.*;
class StringPalindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String ch=sc.nextLine();
    String pal="";
    int len=ch.length();
    for(int i=len-1;i>=0;i--){
      pal+=ch.charAt(i);
    }
    if(ch.equals(pal)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }
}