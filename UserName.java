

import java.util.Scanner;

class UserName 
{
	public static void main(String[] args) throws InterruptedException
		
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your name:");
		String un= sc.next().toUpperCase();
		int len = un.length();
		for(int i=0; i<=len-1;i++)
		{
		System.out.println(un.charAt(i));
		
		}
	}
}
