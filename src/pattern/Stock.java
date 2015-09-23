/*
Copyright 2010 kiddy
*/
package pattern;

import java.util.Observable;

public class Stock extends Observable{
	private float price;
	//Set<StockBuyer> buyers = new HashSet<StockBuyer>();
	
	//constructor
	public Stock() {
		super();
	}
	public Stock(float price) {
		super();
		this.price = price;
	}
	/*
	public void attach(StockBuyer buyer) {
		buyers.add(buyer);
	}
	public void detach(StockBuyer buyer) {
		if(!buyers.contains(buyer)) {
			throw new IllegalArgumentException();
		} else {
			buyers.remove(buyer);
		}
	}*/
	
	public void setPrice(float price) {
		float oldPrice = this.price;
		this.price = price;
		float gainAndLoss = (this.price-oldPrice)/oldPrice * 100;
		System.out.printf("Previous price is %g. Current price is %g. Loss/Gain is %g%%.\n", 
				oldPrice, this.price, gainAndLoss);
		setChanged();
		notifyObservers(this.price);
	}
	/*
	protected void notifyAllBuyers() {
		for(StockBuyer buyer : buyers) {
			buyer.update(this.price);
		}
	}
	*/
}
