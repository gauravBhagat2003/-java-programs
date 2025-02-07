import java.util.Scanner;

class Ascii{
	

	public static void main(String[] args){


	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the character:");

	char c =sc.next().charAt(0);

	//System.out.println((c>='A'&&c<='Z')?(c):("not aCharacter"));


	System.out.println((c>='A'&&c<='Z')||(c>='a'&&c<=122)?((c>='a'&&c<='z')?(c+"is a lower case character"):(c+"is a upper case character")):((c>='0'&&c<='9')?(c+"is a digit"):(c+"it is the special character")));
	}
	}
