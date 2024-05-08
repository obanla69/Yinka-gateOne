import java.util.Scanner;


	public class phaseFour{

		public static void main(String[]args){

		int counter = 0;
		int sum = 0;
		int Average = 0;

		for(counter = 1; counter < 10; counter = counter++){


		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Score : " );
		int score = input.nextInt();
		
		if(counter % 2 == 0){
		
	
		sum += counter;
		
		}
		}
		System.out.println("\n Sum of the even indexes : " + sum);
		


}




}