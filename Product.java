class Product {
	public static void main(String[] args)
	{



	int num=1234;
	int pro=1;

	int rem=num%10;
	pro=pro*rem;

	num=num/10;
	rem=num%10;
	pro=pro*rem;

	num=num/10;
	rem=num%10;
	pro=pro*rem;

	num=num/10;
    rem=num%10;
	pro=pro*rem;

	

	System.out.println("The product of the digits is:"+pro);
	

}


}