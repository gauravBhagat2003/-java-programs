

import java.util.Scanner;
class  PassandFail
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total marks out of 600 :");
		
		Float marks = sc.nextFloat();
		
		Float percentage = (marks*100)/600;
		/*System.out.println("percentage is :"+percentage);
		if(percentage>35){
			
			System.out.println("Pass !!");
		}
		else{
			
			
		System.out.println("Fail!");*/
		
		String op = (percentage>=70)?("Grade A " +percentage):(percentage>=60)?("Grade B " +percentage):(percentage>=35 )?(" Grade C " +percentage):("Failed");
		
		
		System.out.println(op);
		
		
		
	}
}
