
import java.util.Scanner;
class ElseIf 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------ Welcome for the tax calculation--------------");
		System.out.println("Enter the salary in rupees :");
		
		double salary = sc.nextDouble();
		if(salary >0 && salary <=1200000)
		{
			System.out.println("No tax enjoy your life!!!! " );
			return;
			
		}
		
		if(salary >1200000 && salary <=1600000)
		{
			System.out.println("your tax is the :" + (salary*0.15));
			return;
			
		}
		if(salary >1600000 && salary <=2000000)
		{
			System.out.println("your tax is the :" + (salary*0.20));
			return;
			
		}
		if(salary >2000000 && salary <=2400000)
		{
			System.out.println("your tax is the :" + (salary*0.24));
			return;
			
		}
		else{
			
			
			System.out.println("salary is the invalid!!");
		 
		}
		
	}
}
