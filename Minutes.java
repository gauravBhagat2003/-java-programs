import java.util.Scanner;

class Minutes{
	
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the minutes :");

	 long minutes =sc.nextLong();
	 long years = minutes / (60*24*365);
	 long days = (minutes % (years*(60*24*365)) )/(60*24);
	 System.out.println(minutes+"is "+years+"  years and  " +days+ "  days");
	}
}