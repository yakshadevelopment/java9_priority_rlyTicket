package edu.yaksha.rlyTicket;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;  

import static edu.yaksha.rlyTicket.TestUtils.*;

public class MainTest {

	@Test
	public void testFareCalculation() throws Exception {
		int fare=2000;
		Passenger passenger1=new Passenger("Tom", 37);
		Passenger passenger2=new Passenger("Julie", 7);
		Passenger passenger3=new Passenger("Linda", 77);
		TicketCalculate ticketCal=mock(TicketCalculate.class);
		when(ticketCal.fareCalculation(passenger1, fare)).thenReturn(2000); 
		int val=ticketCal.fareCalculation(passenger1,fare);
		yakshaAssert(currentTest(),(val==2000?"true":"false"),businessTestFile);
		when(ticketCal.fareCalculation(passenger2, fare)).thenReturn(1100); 
		val=ticketCal.fareCalculation(passenger2,fare);
		yakshaAssert(currentTest(),(val==1100?"true":"false"),businessTestFile);
		when(ticketCal.fareCalculation(passenger3, fare)).thenReturn(1300); 
		val=ticketCal.fareCalculation(passenger3,fare);
		yakshaAssert(currentTest(),(val==1300?"true":"false"),businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }


}
