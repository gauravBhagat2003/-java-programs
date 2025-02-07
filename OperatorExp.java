

class OperatorExp{
	
	public static void main(String[] args){


	int a=20;
	int b=7;
	int c=0;

	int lar=(a>b)?((a>c)?(a):(b)):((b>c)?(b):(c));

	System.out.println(lar);

	int lar1=(a<b)?((a<c)?(a):(b)):((b<c)?(b):(c));
System.out.println(lar1);
	}
}