  import java.util.Scanner;


	public class BankApp{
		
		private String firstName;
		private String lastName;
		private int accountPin;
		private int closeAccount;
		private  int withdraw;
		private int balance;
		private int transfer;
		private int changePin;


	public BankApp(String firstName, String lastName, int accountPin, int closeAccount, int withdraw, int balance, int transfer, int changePin){

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

			String details = """
			press 
			
			1 -> firstName
			2 -> lastName
			3 -> accountPin
			4 -> closeAccount
			5 -> withdraw
			6 -> balance
			7 -> transfer
			8 -> changePin
			""";
		
			System.out.print(details);
			Scanner input = new Scanner(System.in);
			int optionInput = input.nextInt();
			

			switch(optionInput){

			case 1 :
			
			System.out.print(" Enter your first name : ");
			String userinput = input.next();
			
			
			
			

				
}


		
			

	}





}



