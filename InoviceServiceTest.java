package innovoiceservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class InoviceServiceTest {
	InvoiceGenerator invoiceGenerator = null;
	
	@BeforeAll
	public void setUp() throws Exception{
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnFare() {
		
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculatFare(distance,time);
		System.out.println("fare of  a ride " +fare);
		assertEquals(25, fare);
	}
	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {

		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.returnMinFare(distance,time);
		System.out.println("fare of  a ride " +fare);
		assertEquals(5, fare);
		
	}
	@Test
	public void givenMultipleRide_ShouldReturnInovoiceSummary() {
		
		Ride[] rides = {new Ride(2,5),
						new Ride(0.1,1)};
		
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInoviceSummary = new InvoiceSummary(2,30);
		assertEquals(expectedInoviceSummary, summary);
		
	}
}
