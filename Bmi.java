import java.util.Scanner;
class Bmi{
	

	public static void main(String[] args){


	Scanner sc = new Scanner(System.in);
System.out.println("Enter the weight in pounds:");

float pounds=sc.nextFloat();

System.out.println("Enter the height in inches:");

float height =sc.nextFloat();


float kilogram= pounds*0.45359237f;

float inches= height*0.0254f;

float Bmi= kilogram/(inches*inches);

System.out.println("BMI is "+Bmi);


	}
}