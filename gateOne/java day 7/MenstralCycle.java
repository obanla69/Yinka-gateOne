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

		System.out.print("what is the last month of your period : (14-05-2024)");
		String lastMonth = input.nextLine();

		System.out.print("How many days is your period " );
		int days = input.nextInt();


		LocalDate date = LocalDate.of(2024,14,5);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = date.format(formatter);	

		LocalDate newDate = date.plusDays(5);
		System.out.print(formattedDate);



		}


	}


}