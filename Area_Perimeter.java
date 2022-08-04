import java.io.*;
import java.util.*;  
public class Area_Perimeter{
       public static void main(String[] args) {
       System.out.println("Enter the radius :");  
       Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       if(radius<=0){
         System.out.println("Please enter a non-zero positive number");
       }
       else{
         perimeter = 2 * Math.PI * radius;
         area = Math.PI * radius * radius;
         System.out.println("Perimeter is = " + perimeter);
         System.out.println("Area is = " + area);
       }
	}
}