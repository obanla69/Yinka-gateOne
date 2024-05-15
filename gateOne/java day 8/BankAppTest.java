import java.util.Scanner;



	
	   public static void main(String[]args){
		
	BankApp bankapp1 = new BankApp();
	Account bankapp2 = new BankApp();	


		public static void main(String[]args){

		   Scanner input = new Scanner(System.in);

			int accountPin = 9890;

			System.out.print("WELCOME TO THE BANKE BANK OF NIGERIA ");

		     System.out.print("Enter your firstName : ");
		       String userInput1 = input.next();
		
		         System.out.print("Enter your lastName : ");
		          String userInput2 = input.next();
			
			    System.out.print("Enter your accountPin : ");
			     int entry = input.nextInt();			

				while(entry != accountPin){
				
				  System.out.print("\n INCORRECT PIN. TRY AGAIN. ");
				  System.out.print("ENTER YOUR PIN " );
				    entry = input.nextInt();

			}
					
					System.out.print("\n PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");		



	

	}
	  

		
		
		
	
