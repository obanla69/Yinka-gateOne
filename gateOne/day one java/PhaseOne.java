import java.util.Scanner;


	public class PhaseOne{

		public static void main(String[]args){

		int sum = 0;

	

		Scanner input = new Scanner(System.in);

		for( int counter = 1; counter <=10 ; counter++){
			
		System.out.print("Enter a Score : " );
		int score = input.nextInt();
		
		sum += score;
		}
		System.out.println("\n Sum of the Score : " + sum);
		

	



}




}