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


	public Account(String firstName, String lastName, int accountPin, int closeAccount, int withdraw, int balance, int transfer, int changePin){

		this.firstName = firstName;
		this.lastName = lastName;		

		}
		
		public String getFirstName(){
			return firstName;
		}
		  public void setFirstName(String FirstName){
			this.firstName = firstName;
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

			Account account1 = new Account();

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
	  

		
		
		
	


		}


	








