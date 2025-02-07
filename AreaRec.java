
import java.util.Scanner;
class AreaRec{
	public static void main(String[] args){
         
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter the height of the rectangle :");
         float  height = sc.nextFloat();

         System.out.print("Enter the width of the rectangle :");

         float width = sc.nextFloat();

         float area= height*width;

         System.out.println("Area of the rectangle :" +area);

	}
}