import java.util.Scanner;

class EvenOdd{
	
	public static void main(String[] args)
	{

	System.out.println("Enter a number :");
int num= new Scanner(System.in).nextInt();


System.out.println((num/2)*2==num);// without using bitwise operator program and modulus
System.out.println(num/2==num/2.0);
}

}