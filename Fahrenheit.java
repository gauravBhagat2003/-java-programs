
import java.util.Scanner;

 class Fahrenheit
 {
public static void main(String[] args){
	

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the degree in the celsius :");
	int celsius=sc.nextInt();

    float farenheit = (9.0f/5)*celsius+32;

	System.out.println(celsius+"Celsius is "+farenheit+"Fahrenheit");


}


 }