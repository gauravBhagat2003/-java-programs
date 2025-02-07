  

  class Sum{

  public static void main(String[] args){


  int num =7264;

  int evensum=0;
  int oddsum=0;

  int rem=0;

   rem= num%10;
  evensum = evensum +rem;

  num=num/10;

  rem=num%10;
  evensum= evensum+rem;

  num=num/10;

  rem=num%10;
  evensum= evensum+rem;


  num=num/10;

  rem=num%10;
  oddsum= oddsum+rem;

  System.out.println(evensum);
  System.out.println(oddsum);


  }
  }