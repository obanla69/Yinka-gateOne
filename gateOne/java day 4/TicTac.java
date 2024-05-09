import java.util.Scanner;
 import java.util.Arrays;


	public class TicTac{
	  public static void main(String[]args){

	   Scanner input = new Scanner(System.in);
		int board = 3;
		int column = 3;
		int row = 3;

	int [][]Array = new int [column][row];

	for(int counter = 0; counter < 10; counter++){
			  		
		System.out.print(" Enter a number ");
		String number = input.next();
		 
		Array[counter] = input.next();		
		
		}
		for(int counter = 1; counter <= column; counter++){
		for(int count = 1; count <= row; count++){
		Array [column][row]= input.nextInt();


		}
		System.out.println();

	}


	

	}






	}


		