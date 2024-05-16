
 import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


	public class CheckApp{
	
		public static void main(String[]args){

		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		double total = 1;
		double subTotal = 0;


		ArrayList<String> items = new ArrayList<>();
		ArrayList<Double> goods = new ArrayList<>();
		ArrayList<Double> packages = new ArrayList<>();
		ArrayList<Double> totals = new ArrayList<>();

		
		System.out.println("What is the customer's name: ?");
		String customerName = input.next();
			
		String userResponse = "";
			
		Date date = new Date();

		do{		
			

			System.out.println("What did the user buy: ?");
			String userBuy = input.next();
			
			System.out.println("How many pieces of goods: ?");
			double pieces  = input.nextInt();

			System.out.println("How much per unit: ?");
			double perUnit = input. nextInt();

			System.out.println("Add more items: ?");
			userResponse = input.next();
			
			total = pieces * perUnit;
			items.add(userBuy);
			goods.add(pieces);
			packages.add(perUnit);
			totals.add(total);

		}while(!userResponse.equals("no"));
			
		System.out.println("What is your name:(cashierName) ?");
		String cashier = input.next();
		System.out.println("How much discount will he get: ");
		double howMuch = input.nextInt();
		
			System.out.println("SEMICOLON STORES ");
			System.out.println("MAIN BRANCH ");
			System.out.println("LOCATION :  312, HERBERT MACAULAY WAY, SABO YABO, LAGOS");
			System.out.println("TEL: 03293828343 ");
			System.out.println(date);
			System.out.println("Cashier:  " + cashier);
			System.out.println("CustomerName:  " + customerName);

		System.out.println("=================================");
		System.out.println("ITEM \t QTY \t PRICE \t  TOTAL");
		System.out.println("----------------------------------");
		for(counter = 0; counter < items.size(); counter++){
		System.out.println(items.get(counter) + "\t" + goods.get(counter) + "\t" + packages.get(counter) + "\t" + totals.get(counter));
	subTotal += totals.get(counter);
      }

double discount = howMuch * subTotal / 100;
double vat = 17.50 / 100 * subTotal;
double BillTotal = subTotal + discount + vat;
System.out.println("--------------------------------------");	

System.out.println( "\t" + "Sub Total:" + "\t" +  subTotal);	
System.out.println( "\t" + "Discount:" + "\t" +   discount);
System.out.printf(" 	VAT  @17.50:   %2f%n", vat);
		
System.out.println("--------------------------------------");	

System.out.printf("	BillTotal:     %.2f%n", BillTotal); 

System.out.println(" ======================================");
System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + BillTotal);
System.out.println("=========================================");
	
System.out.println("How much did the customer give to yo? ");
double AmountPaid = input.nextDouble();

	System.out.println("SEMICOLON STORES ");
			System.out.println("MAIN BRANCH ");
			System.out.println("LOCATION :  312, HERBERT MACAULAY WAY, SABO YABO, LAGOS");
			System.out.println("TEL: 03293828343 ");
			System.out.println(date);
			System.out.println("Cashier:  " + cashier);
			System.out.println("CustomerName:  " + customerName);

	System.out.println("=================================");
	System.out.println("ITEM \t QTY \t PRICE \t  TOTAL");
	System.out.println("----------------------------------");
	
 discount = howMuch * subTotal / 100;
 vat = 17.50 / 100 * subTotal;
 BillTotal = subTotal + discount + vat;
  double Balance = BillTotal - AmountPaid;
System.out.println("--------------------------------------");	

System.out.println( "\t" + "Sub Total:" + "\t" +  subTotal);	
System.out.println( "\t" + "Discount:" + "\t" +   discount);
System.out.printf(" 	VAT  @17.50:   %2f%n", vat);
		
System.out.println("--------------------------------------");	

System.out.printf("	BillTotal:    %.2f%n",   BillTotal); 
System.out.printf("      AmountPaid:    %.2f%n ",  AmountPaid);
System.out.printf("	 Balance:     %.2f%n",   Balance);
System.out.println("===========================================");
       System.out.println("THANKS YOU FOR YOUR PATRONAGE ");
System.out.println("========================================");

	}

}
