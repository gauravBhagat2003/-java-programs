import java.util.Scanner;
class AreaofCir
{
 public static void main(String[] args)
 {
 final float pi=22/7;
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius :");
 float r= sc.nextFloat();
 
 float area = pi*r*r;
 System.out.println("Area of the Circle :"+area);
 }
 }
 
 
 
 