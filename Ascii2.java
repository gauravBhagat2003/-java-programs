import java.util.Scanner;

class Ascii2{
	

	public static void main(String[] args){


	Scanner sc= new Scanner(System.in);
System.out.print("Enter the number:");
	int num= sc.nextInt();

	String op =(num%2==0&& num%5==0)?("HITwoFive"):((num%2==0)?("hitwo"):((num%5==0)?("hi five"):("")));

	System.out.print(op);

}
}