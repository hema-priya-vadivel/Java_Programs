import java.util.*;
 class Armstrong
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0,r,temp;
    temp=n;
    while(n>0){
      r=n%10;
      sum+=(r*r*r);
      n=n/10;
    }
    if(temp==sum){
      System.out.println("Armstrong Number");
    }
    else{
      System.out.println("Not Armstrong Number");
    }
   }
 }
