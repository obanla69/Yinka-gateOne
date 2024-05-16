
import java.util.Scanner;
import java.util.Arrays;

 public class StudentGrades{
	public static void main(String[]args){
	
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("How many student do you want do you have :" );
	 int numberOfStudent = input.nextInt();
	 
	 System.out.println("How many subject did they offer");
	int numberOfSubject = input.nextInt();
	 
	 System.out.println("saving  >>>>>>>>>>>>>>>>>>>>>>>");
	 System.out.println("saved successfully     ");
	 
	 int[][]gradeAndNames = new int[numberOfStudent][numberOfSubject];
	  int count = 0;
	  int score = 0;
	 for(int row = 0; row < numberOfStudent;row++){
		 count++;
		int counter = 0;
		 for(int column = 0; column < numberOfSubject;column++){
			 counter++;
				System.out.println("Entering score for student " +count);
				System.out.println("Enter score for subject " +counter); 
				gradeAndNames[row][column] = input.nextInt();
				System.out.println("saving  >>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("saved successfully     ");
				
		 }
	}	
				System.out.println("========================================================");
				System.out.print("STUDENT \t ");
				
				int SUB =0;
				for(int column = 0; column < SUB;column++){
					column++;
					for(int row = 0; row < SUB;row++){
							
						System.out.printf("\tSUB", "%2s", row++);
					}
	
					
					}
					System.out.println("TOT\t AVE\t POS\t ");
					
					
			
				
				System.out.println("========================================================");
			
			
		
		
		
	}

}
