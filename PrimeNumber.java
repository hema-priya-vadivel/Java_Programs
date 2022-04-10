import java.util.*;
class Prime{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     int i,flag=0;
     if(n==0 || n==1){
       System.out.println("Not a prime");
     }
     else{
       for(i=2;i<=n/2;i++){
         if(n%i== 0){  
            System.out.println("Not a prime");                      
            flag=1;
            break;    
       }
      }
      if(flag==0)
        System.out.println("Prime");
     }  
   }
}

 
  