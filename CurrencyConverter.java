import java.util.Scanner;

class CurrencyCon

{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the currency inr :");
		System.out.println();
		float inr=sc.nextFloat();
		System.out.println();
		
		System.out.println();
		System.out.println("**** List of the Currency *******");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("4.JYP");
		System.out.println("4.RUB");
		System.out.println();
		System.out.println("Enter the currency:");
		String curr=sc.next().toUpperCase();
		float conCurr=0;
		
		if(curr.equals("USD")){
			conCurr=(inr)/86.56f;
			System.out.print(inr+"INR"+conCurr+"USD");
		}
		else if(curr.equals("EUR")){
			conCurr=(inr)/90.25f;
			System.out.print(inr+"INR"+conCurr+"EUR");
		}
		else if(curr.equals("GBP")){
			conCurr=(inr)/107.65433f;
			System.out.print(inr+"INR"+conCurr+"GBP");
		}		
		else if(curr.equals("PKR")){
			conCurr=(inr)/0.31f;
			System.out.print(inr+"INR"+conCurr+"PKR");
		}
		else if(curr.equals("JYP")){
			conCurr=(inr)/0.55679f;
			System.out.print(inr+"INR"+conCurr+"JYP");
		}
	else if(curr.equals("RUB")){
			conCurr=(inr)/0.88449f;
			System.out.print(inr+"INR"+conCurr+"RUB");
		}
		else {
			
		System.out.print("INVALID OPTION");
		
	}
	}
}
