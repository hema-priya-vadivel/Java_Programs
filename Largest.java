import java.io.*;
import java.util.*;  
public class Largest{
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the value of x :");
        int x = s.nextInt();
        System.out.println("Enter the value of y :");
        int y = s.nextInt();
        System.out.println("Enter the value of z :");
        int z = s.nextInt();
        int result = 0;
        if(x>y && x>z){
          System.out.println("x is the largest value");
        }
        else if(y>x && y>z){
          System.out.println("y is the largest value");
        }
        else{
          System.out.println("z is the largest value");
        }
    }
 }