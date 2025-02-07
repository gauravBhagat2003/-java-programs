
import java.util.Scanner;
class  Del
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Student:");
		int student = sc.nextInt();
		
		System.out.print("Enter the number of count:");
		
		
		int count = sc.nextInt();
		
		System.out.println(count%student+1);
	}
}
