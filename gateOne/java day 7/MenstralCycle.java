import java.util.Scanner;
  import java.time.Period;
   import java.time.LocalDate;
   import java.util.Date;
    import java.time.format.DateTimeFormatter;
     import java.time.temporal.ChronoUnit;
     

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

		System.out.println("what is the first day of your last  month of your period : (dd/MM/YYYY)");
		String firstMonth = input.next();
		
		System.out.println("what was the last day of your last two month of mestrual cycle(dd/MM/YYYY)");
		String LastMonth = input.next();

		System.out.println("How many days is your period " );
		int days = input.nextInt();
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");			
		LocalDate localFirstMonthDate = LocalDate.parse(firstMonth,formatter);
		LocalDate localLastMonthDate = LocalDate.parse(LastMonth, formatter);

		long lengthCycle  = ChronoUnit.DAYS.between(localFirstMonthDate,localLastMonthDate);
		System.out.println("The Total LengthCycle is " + lengthCycle);

		
		LocalDate nextCycle = localLastMonthDate.plusDays(lengthCycle);

		System.out.printf("The nextCycle is " + nextCycle);

		LocalDate ovulationDate = localLastMonthDate.minusDays(lengthCycle);
		System.out.println(" The  OvulationDate is " + ovulationDate);



		 }


	}

}