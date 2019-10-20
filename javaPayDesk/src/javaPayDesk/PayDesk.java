package javaPayDesk;

import java.util.Scanner;
import javaPayDesk.Bronze;
import javaPayDesk.Silver;
import javaPayDesk.Gold;

public class PayDesk {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Bronze bronze = new Bronze();
		Silver silver = new Silver();
		Gold gold = new Gold();
		
		System.out.println("Bronze:");
		System.out.println("Enter turnover: ");
		double turnoverBronze = s.nextDouble();
		
		double rateBronze = bronze.turnover(turnoverBronze);
		
		System.out.println("Enter purchase value");
		double valueOfPurchaseBronze = s.nextDouble();
		 
		double discount = valueOfPurchaseBronze*rateBronze/100;
		double total = valueOfPurchaseBronze-discount;
	
		System.out.println("Value of purchase: $" +valueOfPurchaseBronze);
		System.out.println("DiscountRate : "+rateBronze+"%");
		System.out.println("Discount: " +discount+"%");
		System.out.println("Total:$"+total);
		 
		System.out.println("Silver:");
		System.out.println("Enter turnover: ");
		double turnoverSilver = s.nextDouble();
		
		double rateSilver = silver.turnover(turnoverSilver);
		System.out.println("Enter purchase value");
		double valueOfPurchaseSilver = s.nextDouble();
		
		 
		double discountSilver = valueOfPurchaseSilver*rateSilver/100;
		double totalSilver = valueOfPurchaseSilver-discountSilver;
	
		System.out.println("Value of purchase: $" +valueOfPurchaseSilver);
		System.out.println("DiscountRate : "+rateSilver+"%");
		System.out.println("Discount: " +discountSilver+"%");
		System.out.println("Total:$"+totalSilver);


		System.out.println("Gold:");
		System.out.println("Enter turnover: ");
		double turnoverGold = s.nextDouble();
		double rateGold = gold.turnover(turnoverGold);
		System.out.println("Enter purchase value");
		double valueOfPurchaseGold = s.nextDouble();
		 
		double discountGold = valueOfPurchaseGold*rateGold/100;
		double totalGold = valueOfPurchaseGold-discountGold;
	
		System.out.println("Value of purchase: $" +valueOfPurchaseGold);
		System.out.println("DiscountRate : "+rateGold+"%");
		System.out.println("Discount: " +discountGold+"%");
		System.out.println("Total:$"+totalGold);
		 

	}

}
