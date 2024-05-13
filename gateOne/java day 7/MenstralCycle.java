import java.util.Scanner;
  import java.time.Period;
   import java.time.LocalDate;
   import java.util.Date;


	public class MenstralCycle{

           public static void main(String[]args){

	       String menstralCycle = """
		To calculate cycle;
		press
	
		1-> flow date
		2-> safe periods
		3->  ovaluation period
		""";		
	
		System.out.print(menstralCycle);
		Scanner input = new Scanner(System.in);
		int cycle = input.nextInt();

		switch(cycle){
		case 1 :
		System.out.println("Flow date");
		case 2 :
		System.out.println("safe period");
		case 3 :
		System.out.println("ovaluation period");


		String flowDate = """

		to calculate the flow date
		""";
		
		

		System.out.print("Enter a current date of your menstral pain : ");
		int curDate = input.nextInt();

			int month = 30;	

		LocalDate startDate = LocalDate.now().minusMonths(1);
		LocalDate endDate =  LocalDate.now();
		Period fromMonths = Period.ofMonths(1);
		Date date = new Date();
		
		curDate = curDate - month;
		
		System.out.printf("CurDate between startDate and: " %d%n + " endDate is :  %d%n + ", Period.ofMonths(1));






		
		}

		
	



	}


}