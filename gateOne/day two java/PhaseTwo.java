import java.util.Scanner;


	public class PhaseTwo{

		public static void main(String[]args){

		int sum = 0;
		int Average = 0;
	

		Scanner input = new Scanner(System.in);

		for( int counter = 1; counter <=10 ; counter++){
			
		System.out.print("Enter a Score : " );
		int score = input.nextInt();
		
		sum += score;
		Average = sum / 10;
		}
		System.out.println("\n Average of the score: " + Average);

	



}




}