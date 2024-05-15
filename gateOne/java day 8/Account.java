  import java.util.Scanner;


	public class Account{
		
		private String firstName;
		private String lastName;
		private int accountPin;
		private int closeAccount;
		private  int withdraw;
		private int balance;
		private int transfer;
		private int changePin;
		private int amount;


	public Account(String firstName, String lastName, int accountPin, int closeAccount, int withdraw, int balance, int transfer, int changePin, int account){

		this.firstName = firstName;
		this.lastName = lastName;		

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

		   public void setCloseAccount(int closeAccount){
			this.closeAccount = closeAccount;
		}	

		    public int getwithdraw(){
			 return withdraw;
		   }

		    public void setWithdraw(int withdraw){
			if(balance >= amount){
			 balance = balance - amount;
			  System.out.print("balance after withdrawal: " + balance);
			
			}else{

				System.out.println("Your balance is less than " + amount + " \t Transaction failed...");
			   }
			
			this.withdraw = withdraw;

			}	

		     public int getTransfer(){
			return transfer;
		    }
		
			public void setTransfer(int transfer){
				this.transfer = transfer;
			 }

			   public int getChangePin(){
				return changePin;
			  }

			public void setChangePin(int changePin){
				this.changePin = changePin;
			}

			public int getBalance(){
				return balance;
			
			}
	
			public void setBalance(){
				this.balance = balance;
			}


	
	   public static void main(String[]args){
		   Scanner input = new Scanner(System.in);
 			

			String account1;
			
			int accountPin = 9890;

			System.out.println("WELCOME TO THE BANKE BANK OF NIGERIA ");

		     System.out.print("Enter your firstName : ");
		       String userInput1 = input.next();
			 		
		         System.out.print("Enter your lastName : ");
		          String userInput2 = input.next();
			
			    System.out.print("Enter your accountPin : ");
			     int entry = input.nextInt();			

				while(entry != accountPin){
				
				  System.out.println("\n INCORRECT PIN. TRY AGAIN. ");
				  System.out.println("ENTER YOUR PIN " );
				    entry = input.nextInt();

			}
					
				System.out.println("\n PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");											
			}
	  			
				System.out.print("Enter amount for deposit : ");
				int deposit = input.nextDouble();

				System.out.printf("%n adding %.2.f to firstName balance%n%n ", + deposit);
				firstName.deposit(deposit);

				System.out.printf("%s balance: $%.2f%n", firstName.getName(),firstName.getBalance());
	


		}


	








