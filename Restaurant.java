import java.util.*;
class  Restaurant
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket = new ArrayList<>(); 
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(; ;)
		{
		System.out.println();
		System.out.println("  JAVA KA DHABA" );
		System.out.println();
		System.out.println("1. Create Account");
		System.out.println("2. Existing User");
		System.out.println();
        System.out.println("Enter the option");
        int opt =sc.nextInt();
		System.out.println();
		switch(opt){
			case 1 : createAccount(sc);break;
			case 2 :login(sc); break;
			default :System.out.println("Invalid Input");
              break;  	
	}
}
	}
	public static void createAccount(Scanner sc){
		System.out.println("  REGISTRATION");
		System.out.println();
		System.out.println("Name:");
		name= sc.next();
		System.out.println("Phone:");
		contact=sc.nextLong();
		System.out.println("Address:");
		sc.nextLine();
		address =sc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY ");
	}
	
		public static void login(Scanner sc)
	{
			if(name==null)
		{
				System.out.println("CREATE YOUR ACCOUNT FIRST");
				return;
		}
		System.out.println("  LOGIN");
		System.out.println();
		
		for(int attempt =3;attempt>=1;attempt--){
			
			System.out.println("Username:");
			String username=sc.next();
			System.out.println("Password:");
			Long phone=sc.nextLong();
			System.out.println();
			if(name.equals(username)&& contact == phone)
			{
				homePage(sc);
			}else{
				System.out.println("Invalid Cred");
			    System.out.println("Attempt Left:"+(attempt-1));
				System.out.println();
			}
		}
		System.out.println("THANK YOU &NEVER VISIT AGAIN");
		System.exit(0);
	}
	public static void homePage(Scanner sc)
	{
		for(;;){
			System.out.println();
			System.out.println("    HOME PAGE");
			System.out.println();
			System.out.println("1.MENU");
			System.out.println("2.ORDER");
			System.out.println("3.TABLE BOOKING");
			System.out.println("4.LOGOUT");
			System.out.println();
			System.out.println("ENTER an Option:");
			int opt =sc.nextInt();
			
			switch(opt)
			{
				case 1: menu(sc);break;
				case 2: order(sc);break;
				case 3: tableBooking();break;
				case 4:System.out.println("THANK U VIST AGAIN");
	                   System.exit(0);break;
				default: System.out.println("Invalid Option");break;
			}
		}
	}
	public static void menu(Scanner sc)
	{
		for(;;)
		{
			System.out.println();
			System.out.println("MENU");
			System.out.println("101 : Butter_chicken=450/-");
			System.out.println("102 : Biryani_chicken=400/-");
			System.out.println("103 : Shahi Paneer=350/-");
			System.out.println("104 : MIx_veg=450/-");
			System.out.println("105 : Roti=35/-");
			System.out.println("106 : EXIT MENU");
			System.out.println();
			System.out.println("Enter an food id:");
			int id=sc.nextInt();
			switch(id){
				case 101 : {
					basket.add("101 : Butter_chicken=450");
					System.out.println("Butter chicken added inside basket");
					break;
				}
				case 102 : {
					basket.add("102 : Biryani_chicken=400");
					System.out.println("Biryani_chicken added inside basket");
					break;
					
				}
				case 103 : {
					basket.add("103 : Shahi Paneer=350");
					System.out.println("Shahi Paneer added inside basket");
					break;
					
				}
				case 104 : {
					basket.add("104 :  MIx_veg=450");
					System.out.println("MIx_veg added inside basket");
					break;
					
				}
				case 105 : {
					basket.add("105 : Roti=35");
					System.out.println("Roti added inside basket");
					break;
					
				}
				case 106 : {
					return;
				}
				default:{
					System.out.println("Invalid Food Id");
					break;
				}
			}
		}
	}
	public static void order(Scanner sc)
	{
		System.out.println();
		System.out.println(" ORDERS");
		System.out.println();
		if(basket.size()==0){
			System.out.println("BASKER IS EMPTY ADD FOOD ITEMS");
		}
		for(String foodItem : basket)
		{
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2.Remove Food ITem");
		System.out.println("3.Proceed to payment");
		System.out.println();
		System.out.println("Enter the option:");
		int opt =sc.nextInt();
		System.out.println();
		switch(opt)
		{
			case 1:{
				System.out.println("Order Cancelled");
				basket.clear();
				break;
			}
			case 2:{
				System.out.println("Enter foodId:");
				int foodId=sc.nextInt();
				removeFoodId(foodId);
				break;
			}
			case 3:{
				billGenerate();
				break;
			}
		}
	}
	public static void removeFoodId(int foodId)
	{
		ArrayList<String> dupBasket=new ArrayList<>(basket);
		int indx=0;
		boolean flag=false;
		for(String foodItem : dupBasket)
		{
			String [] arr = foodItem.split(" ");
			if(arr[0].equals(foodId+""))
			{
				dupBasket.remove(indx);
				flag=true;
				System.out.println("FOOD ITEM REMOVED");
			}
			indx++;
		}
		if(!flag)
			System.out.println("FOOD ITEM DOESN'T EXIST IN BASKET");
		basket= dupBasket;
	}
	public static void tableBooking()
	{
		System.out.println();
		System.out.println(" Table Booking");
		System.out.println();
	}
	public static void billGenerate()
	{
		double totalBill=0;
		for(String foodItem : basket)
		{
			String [] arr = foodItem.split(" " );
			totalBill +=Double.parseDouble(arr[4]);
		}
		System.out.println("Total Bill :"+ totalBill+"rs.");
	}
}