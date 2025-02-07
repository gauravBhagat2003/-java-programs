
import java.util.Scanner;
class Pound{
	
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the pound in numbers :");
float  pound = sc.nextFloat();


float kilo = pound*0.453592f;
System.out.println("Pound "+pound+"is "  +kilo+  "kilogram");



	}
} 