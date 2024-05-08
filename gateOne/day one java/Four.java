import java.util.Scanner;


	public class phaseFour{

		public static void main(String[]args){

		int sum = 0;
		int Average = 0;
		int even;

		Scanner input = new Scanner(System.in);

		for( int counter = 0; counter <=10 ;counter =  counter+2){
			
		System.out.print("Enter a Score : " );
		int score = input.nextInt();
		
		sum += score;
		Average = sum / 10;
		}
		System.out.println("\n Average of the score: " + Average);
		System.out.println("\n Sum of the Score : " + sum);
		System.out.println("\n even of the score is: " + even);
		



}




}