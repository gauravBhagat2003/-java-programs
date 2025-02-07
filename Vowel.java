import java.util.Scanner;

class Vowel{
	
	public static void main(String args[]){

	Scanner sc= new Scanner(System.in);

	System.out.print("Enter the vowel:");

	char ch= sc.next().charAt(0);

String op= (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+"character is the vowel"):(ch+  " Character is not vowel");


	System.out.print(op);
	}
}