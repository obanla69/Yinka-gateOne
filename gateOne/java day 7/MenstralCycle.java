import java.util.Scanner;
  import java.time.Period;
   import java.time.LocalDate;
   import java.util.Date;
    import java.time.format.DateTimeFormatter;
     

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

		System.out.println("what is the last month of your period : (14/05/2024)");
		String lastMonth = input.nextLine();

		System.out.println("How many days is your period " );
		int days = input.nextInt();
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");			System.out.println("Todays date is " + today);		
		LocalDate freeFlow = today.plusMonths(1);
		System.out.println("Your free period is " + freeFlow);

		int sum = 0;
		int averageLengthCycle = 0;
			
		System.out.print("Enter a number : ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
	 	 sum = number1 + number2 + number3;
		averageLengthCycle /= sum;
		System.out.printf("AverageLengthCycle is %.2f%n", + averageLengthCycle);
			
	
				

		}


	}

}