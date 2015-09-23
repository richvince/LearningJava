/*
Copyright 2010 kiddy
*/
package innerclasses;

public class Parcel6 {

	private void internalTracking(boolean b) {
		if(b) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String s) {
					id = s;
				}
				String getSlip() { return id; }
			}
			TrackingSlip ts = new TrackingSlip("light");
			ts.getSlip();
		}
	}
	
	public void track() { internalTracking(true); }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 p = new Parcel6();
		p.track();
	}

}
