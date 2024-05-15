  import java.util.Scanner;


	public class BankApp{
		
		private String name;
		private int pin;
		private int closeAccount;
		private  int withdraw;
		private long accountBalanace;
		private int Transfer;
		private int changePin;


	public BankApp(String name, int pin, int closeAccount, int withdraw, long accountBalance, int transfer, int changePin){

		this.name = name;
		this.AccountPin = AccountPin;
		this.closeAccount = closeAccount;
		this.withdraw = withdraw;
		this.transfer = transfer;
		this.changePin = changePin;
		this.accountBalance = accountBalance;
		
		}
		
		public String getName(){
			return name;
		}
		  public void setName(String name){
			this.name = name;
		}
		
		   public int getAccountPin(){
			return AccountPin;
		}

		  public void setAccountPin(int pin){
			this.AccountPin = AccountPin;
		}
			
		   public long getCloseAccount(){
			return closeAccount;
		}

		   public void setCloseAccount(long closeAccount){
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
				retrun changePin;
			  }

			public void setChangePin(int changePin){
				this.changePin = changePin;
			}

			public long getAccountBalance(){
				return accountBalance;
			
			}
	
			public void setAccountBalance(){
				this.accountBalance = accountBalance;
			}




}



