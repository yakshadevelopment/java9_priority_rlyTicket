package edu.yaksha.rlyTicket;

import static org.junit.Assert.*;

import org.junit.Test;
import static edu.yaksha.rlyTicket.TestUtils.*;

public class MainTest {

	@Test
	public void testFareCalculation() throws Exception {
		int fare=2000;
		Passenger passenger1=new Passenger("Tom", 37);
		Passenger passenger2=new Passenger("Julie", 7);
		Passenger passenger3=new Passenger("Linda", 77);
		int val1=Main.fareCalculation(passenger1, fare).getFare();
		int val2=Main.fareCalculation(passenger2, fare).getFare();
		int val3=Main.fareCalculation(passenger3, fare).getFare();
		yakshaAssert(currentTest(),(val1==2000?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(val2==1100?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(val3==1300?"true":"false"),businessTestFile);
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
