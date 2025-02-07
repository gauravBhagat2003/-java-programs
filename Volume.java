import java.util.Scanner;
class Volume{
	
	public static void main(String args[])
	{
     final  float pi = 3.14f;

	Scanner sc = new Scanner(System.in);
       System.out.print("Enter radius and length of the cylinder :");

       float radius=sc.nextFloat();
       float length=sc.nextFloat();

       float area = pi*radius*radius;
       float volume= area*length;
       System.out.println("The area of the cylinder :"+area);
       System.out.print("The Volume of the cylinder :"+volume);


	}
}