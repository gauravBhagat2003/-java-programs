 
 
 import java.util.Scanner;
 class  Calculator
 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number 1:");
		
		float num1=sc.nextFloat();
		System.out.println("Enter the number 2:");
		
		float num2=sc.nextFloat();
		
		System.out.println("Enter the operator :");
		
		char ch =sc.next().charAt(0);
		float op =0;
		
		 op = (ch=='+')?(num1+num2):(ch=='-')?(num1-num2):(ch=='*')?(num1*num2):(ch=='/')?(num1/num2):(ch=='%')?(num1%num2):0.00000f;
		
		
		String output= num1 + "" +ch + "" +num2 + "=" + op;
		if((op==0.00000f))
		{		
		System.out.println("Invalid operatotr" + output);
		
		}
		/*else{
		System.out.println(""+output);	
		}*/
		
	}
}
