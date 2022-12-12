package innovoiceservice;
	
public class InvoiceGenerator {
	int COST_PKM = 10;
	int COST_TIME = 1;
	int MINIMUM_FARE = 5;
	public double calculatFare(double distance, int time) {
		double fare = COST_PKM* distance + COST_TIME * time;
				return Math.max( fare,MINIMUM_FARE);
		
		
	}
	public double returnMinFare(double distance, int time) {
		double fare = COST_PKM* distance + COST_TIME * time;
		if(fare > MINIMUM_FARE) {
			return fare;
		}
		else {
			return MINIMUM_FARE;
		}
	}
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride : rides) {
			totalFare += this.calculatFare(ride.distance,ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}
}
