/*
Copyright 2010 kiddy
*/
package pattern;

import java.util.Observable;

public class PrivateInvestor implements StockBuyer {

	/*
	public void update(float price) {
		// TODO Auto-generated method stub
		System.out.printf("%s knows the price change!\n", this.getClass().getName());
	}
	*/
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.printf("%s knows the price change!\n", this.getClass().getName());
	}

}
