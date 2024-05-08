import java.util.Scanner;


	public class phaseFive{

		public static void main(String[]args){

		int sum = 0;
		int Average = 0;
		int even = 0;

		Scanner input = new Scanner(System.in);

		for( int counter = 0; counter <=10; counter+2){

		System.out.print("Enter a Score : " );
		int score = input.nextInt();
		
		if(counter % 2 == 0){

		sum += counter;
		
		}
		}
		System.out.println("\n Sum of the even indexes : " + sum);
		


}




}