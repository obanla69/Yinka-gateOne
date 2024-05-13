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
		
		

		System.out.println("Enter a current date of your menstral pain: (05 13 2024)");
		String curDate = input.next();

			int month = 30;	

		LocalDate startDate = LocalDate.now().minusMonths(1);
		LocalDate endDate =  LocalDate.now();
		Period fromMonths = Period.parse(flowDate);
		Date date = new Date();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		



		
		}

		
	



	}


}