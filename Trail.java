  import java.util.Scanner;
  
  
  class  Trail
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the character :");
		
		char ch=sc.next().charAt(0);
		
	String op =((ch>='A'&& ch<='Z'|| ch>='a'&& ch<=122)?((ch>='a'&& ch<='z')?("It is the lowercase character"):("It is the upppercase character")):((ch>='0'&& ch<='9')?("it is the digit"):("it is the special character")));
		System.out.println(""+op);
	}
}
