
import java.util.Scanner;

class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month:");
			
			 String month= sc.next().toLowerCase();
		
		
		String op = (month.equals("february"))||(month.equals("march"))||(month.equals("april"))||(month.equals("may"))?("Summer " +month):(month=="june")||(month.equals("july"))||(month.equals("august"))||(month.equals("september"))?("Mansoon " +month):(month.equals("october"))||(month.equals("november"))||(month.equals("december"))||(month.equals("january"))?("Winter " +month):("Invalid");
		System.out.println(op);
	}
}
