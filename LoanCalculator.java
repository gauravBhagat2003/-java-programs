
import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the loan amount:");
		float amount=sc.nextFloat();
		System.out.println("Enter the ROI:");
	    float roi=sc.nextFloat();
		System.out.println("Enter the months:");
	     int months=sc.nextInt();
		 
		 String str=(months/12)+"."+(months%12);
		 float conv=Float.parseFloat(str);
		 
		 System.out.println();
		 System.out.println("Principal amount :"+amount);
		 System.out.println("ROI:"+roi+"%");
		 System.out.println("Tenrue:"+months+"months");
		 
		 float intYear=amount*roi/100;
		 float totalInter=intYear*conv;
		 System.out.println("Interest :"+totalInter);
		 float outstanding=totalInter;
		 System.out.println("TotalOutstanding Amount :"+(outstanding));
		 System.out.println("EMI :"+(outstanding/months)+ "rs");
		 
	
	
	
	
	
	}
	
}
