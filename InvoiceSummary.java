package innovoiceservice;

public class InvoiceSummary {

	public int numberOfRide;
	public double totalFare;
	public double averageFare;

	public InvoiceSummary(int numberOfRide, double totalFare) {
		this.numberOfRide = numberOfRide;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.numberOfRide;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(averageFare) == Double.doubleToLongBits(other.averageFare)
				&& numberOfRide == other.numberOfRide
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}

}
