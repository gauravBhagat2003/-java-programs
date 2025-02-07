import java.util.Scanner;

class FinancialApp{
	

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the subtotal :");

float subtotal= sc.nextFloat();

System.out.print("Enter the tiprate:");

float tiprate =sc.nextFloat();

float tip = subtotal*(tiprate/100);
float total=tip+subtotal;

System.out.println("tip is"+tip+"total is the "+total);


	}
}