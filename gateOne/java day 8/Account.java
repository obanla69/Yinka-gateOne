  import java.util.Scanner;


	public class Account{
		
		private String firstName;
		private String lastName;
		private int accountPin;
		private int closeAccount;
		private static double balance;
		private  static int transfer;
		private int changePin;
		private static int amount;
		private static int deposit;

	public Account(String firstName, String lastName, int accountPin, int closeAccount, int withdraw, int balance, int transfer, int changePin, int account , int deposit){

		this.firstName = firstName;
		this.lastName = lastName;
		this.amount = amount;
		this.deposit = deposit;	

		}
		
		public String getFirstName(){
			return firstName;
		}
		  public void setFirstName(String FirstName){
			this.firstName = firstName;
		}

		public void setAmount(int amount){
			this.amount = amount;
		}
		public int getAmount(){
			return amount;
		}

		public int getDeposit(){
			return deposit;
			
		}
				
		public String getLastName(){
			return lastName;
		}

		public void setLastName(){
			this.lastName = lastName;
		}
		
		   public int getAccountPin(){
			return accountPin;
		}

		  public void setAccountPin(int pin){
			this.accountPin = accountPin;
		}
			
		   public int getCloseAccount(){
			return closeAccount;
		}

		     public int getTransfer(){
			return transfer;
		    }
		
			   public int getChangePin(){
				return changePin;
			  }

				public double getBalance(){
				return balance;
			
			}

	
	   public static void main(String[]args){
		   Scanner input = new Scanner(System.in);
			
			int option = 0;
			
			while (option != 5){

			System.out.println("WELCOME TO THE BANKE BANK OF NIGERIA ");
			System.out.println(" 1  To create account");
			  System.out.println(" 2  Deposit");
			    System.out.println(" 3 balance" );
			      System.out.println(" 4 withdraw ");
				System.out.println(" 5 exit");
			        System.out.println(" Enter an option: ");
			           option = input.nextInt();
				
				switch (option){

				case 1 :
				   account();
				    break;	
				case 2 :
				    deposit();
				     break;
				case 3 :
				     balance();
				      break;
				case 4 :
				     withdraw();
				     break;
				case 5 :
				    System.out.print("Invalid option.Try again. " );
               }
            }
           }
            public static void account(){
                   Scanner input = new Scanner(System.in);
                  System.out.println("Enter your firstName : ");
		   String userInput1 = input.next();
			 		
		  System.out.println("Enter your lastName : ");
		  String userInput2 = input.next();
			
	          System.out.println("Enter your accountPin : ");
	          int entry = input.nextInt();			
                  
              while(entry == 4){
		  System.out.println("ENTER YOUR PIN " );
		   entry = input.nextInt();

		}

		
                System.out.println("\n PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		System.out.println(" YOU ARE SUCCESSFUL HAVE AN ACCOUNT");
                   
	     									
             }

		public static void balance(){
		   System.out.println("Your current Balance is $" + balance);
		 


		}		

                public static double deposit(){
                 Scanner input = new Scanner(System.in);
                 System.out.println("How much do you want to deposit?   ");
                 double amount = input.nextDouble();
		  System.out.println(" YOU HAVE SUCCESSFULLY  DEPOSIT " );
                 if(amount > 0){
                     balance += amount;
                  } 
		
                    return balance;
		}

               public static void withdraw(){
               Scanner input = new Scanner(System.in);
                System.out.println("How much do you want to withdraw?   ");
                 double amount = input.nextDouble();
		 System.out.print("YOU HAVE SUCCESSFULLY WITHDRAW ");
                   if(balance >= amount){
			 balance = balance - amount;
		
		}                
               }

	
	}		




	








