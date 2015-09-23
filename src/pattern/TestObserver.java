/*
Copyright 2010 kiddy
 */
package pattern;

public class TestObserver {
	public static void main(String[] args) {
		Stock stock = new Stock(12);
		PrivateInvestor pi = new PrivateInvestor();
		InstitutionlInvestor ii = new InstitutionlInvestor();
		stock.addObserver(pi);
		stock.addObserver(ii);
		stock.setPrice(21);
	}
}
