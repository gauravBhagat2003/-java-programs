
import java.util.Scanner;
class BillAmt
  
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		double Bill =sc.nextDouble();

			
			if(Bill>2000){
				
				
				Bill -=(Bill*0.1);
			}
		System.out.println(""+Bill);
	}
}


