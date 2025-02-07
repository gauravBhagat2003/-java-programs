

import java.util.Scanner;
class VowelName
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String user=sc.next().toUpperCase();
		int len=user.length();
		for(int i=0; i<=len-1;i++){
			
			if((user=="A") || (user=="E")|| (user=="I") ||( user=="O") ||( user=="U"))
			
			
				System.out.println(user+"  ");
				
			
		}
}
}

