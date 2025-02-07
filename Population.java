


class Population
{
 public static void main(String[] args)
 {
 
 long cp = 312032486;
final long seconds=(356*24*60*60)*5;
 
 long brate=seconds/7;
 long deathr=seconds/13;
 long mr=seconds/45;
 
 long fiveyear=cp+brate-deathr+mr;
 
 System.out.print("Next five year population is :"+fiveyear);
 }
 }
 