  import java.util.Scanner;
   import java.util.Arrays;

	public class ValidCard{
	   public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int[]arrays = new int [16];
		String[]numbers = arrays(arrays);
		
		System.out.print(" Enter a number : ");
		String card = input.next();
		

		System.out.print(Arrays.toString(numbers));
			

	}


	public static int cardSize(String number){
	
	return number.length();
}


	public static int [] activeNumber(String number){

	int[]numbers = new int[number.length()];
		int counter = 0;
	for(int count = 0; count < number.length();count++){
		counter++;
		}

	return numbers;
   }
	
}
     
	
