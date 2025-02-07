class ReverseSt{
	
	public static void main(String[] args){

	String st ="Hello";
String dup=st;
	String rev=0;

	String rem=st%10;
	rev=rev*10+rem;


	 st=st/10;
	 rem=st%10;
	 rev=rev*10+rem;

	 st=st/10;
	 rem =st%10;
	 rev=rev*10+rem;

	 st=st/10;
	 rem =st%10;
	 rev=rev*10+rem;


System.out.println("Number to be reverse :"+dup+ "reversed number is :"+rev);


	}
}