
import java.util.Scanner;

class EVM 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		int bjp=0,cng=0,aap=0,mns=0,nota=0,ss=0;
		System.out.println();
		System.out.println("Welcome");
		System.out.println();
		System.out.println("Enter the population :");

        int pop= sc.nextInt();
		

		
		for(int i=1;i<=pop;i++){
			
			System.out.println();
			System.out.println("List of the parties:");
			System.out.println("1.BJP");
			System.out.println("2.CNG");
			System.out.println("3.ss");
			System.out.println("4.mns");
			System.out.println("5.aap");
			System.out.println("6.NOTA");
			System.out.println();
			
			System.out.println("Enter the option:");
			int opt=sc.nextInt();
			
			if(opt>=1 && opt<=6){
				
				if(opt==1){
					bjp++;
					System.out.println("ache din ayenge");
	}
	if(opt==2){
					cng++;
					System.out.println("papu");
	}
	if(opt==3){
					ss++;
					System.out.println("hum he asli shivsena");
	}
	if(opt==4){
					mns++;
					System.out.println("jai maharashtra");
	}
	if(opt==5){
					aap++;
					System.out.println("mujhye aajad karo");
	}
	if(opt==6){
					nota++;
					System.out.println(" you are the educated person");
	}
	if(!(opt>=1&&opt<=6)){
		i--;
		
					System.out.println("invalid option");
	}
}
if (bjp>=cng &&  bjp>=ss && bjp>=mns && bjp>=aap && bjp>=nota){
	
System.out.println("Bjp won by "+bjp +" votes");
//return;
	}
	if (cng>=bjp &&  cng>=ss && cng>=mns && cng>=aap && cng>=nota){
	
System.out.println("cng won by "+cng+ " votes");
//return;
	}
	if (ss>=cng &&  ss>=bjp && ss>=mns && ss>=aap && ss>=nota){
	
System.out.println("ss won by "+ss+ " votes");
//return;
	}
	if (mns>=cng && mns>=ss && mns>=bjp && mns>=aap && mns>=nota){
	
System.out.println("ss won by "+ss + " votes");
//return;
	}
	if (aap>=cng &&  aap>=ss && aap>=mns && aap>=bjp && aap>=nota){
	
System.out.println("aap won by "+aap +"  votes");
//return;
	}
		
	if (nota>=cng &&  nota>=ss && nota>=mns && nota>=aap && nota>=bjp){
	
System.out.println("nota won by "+nota + "votes");
//return;
	}
}
	}
}