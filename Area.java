import java.util.Scanner;
  public class Area{
    public static void main (String args[]){
    System.out.println("Enter the radius");
    Scanner sc = new Scanner(System.in);
    double radius=sc.nextDouble();
    double Area;
    Area=Math.PI * radius * radius;
    System.out.println("Area of circle is " + Area);
   }
}