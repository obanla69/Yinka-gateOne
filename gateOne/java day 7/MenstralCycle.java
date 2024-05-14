import java.util.Scanner;
  import java.time.Period;
   import java.time.LocalDate;
   import java.util.Date;
    import java.time.format.DateTimeFormatter;
     import java.time.Temporal;


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

		System.out.println("The current date of your menstral pain: (05 13 2024)");
		String curDate = input.next();

		System.out.print("How many days your last period: ");
		 LocalDate lastDate = LocalDate.parse(scanner.nextLine());

		System.out.print("Enter the average menstrual cycle length in days: ");
		int cycleLength = scanner.nextInt();

		LocalDate nextMenstrualFlow = lastDate.plusDays(cycleLength);

	
		 LocalDate ovulationDate = lastDate.pluDays(cycleLength / 2);

		LocalDate startDate = LocalDate.now().minusMonths(1);
		LocalDate endDate =  LocalDate.now();
		Period fromMonths = Period.parse(flowDate);
		Date date = new Date();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("startDate : " + (endDate));
		
		



		
		}

		
	



	}


}