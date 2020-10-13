package edu.yaksha.rlyTicket;

public class TicketCalculate {
	public  int fareCalculation(Passenger passenger, int normalFare)
	{
		double fare=normalFare;
		int age=passenger.getAge();
		 if(age<=14)	
	    		fare=fare-(fare*0.45);
	    	  else if(age>=65)
	    	  {
	    		  fare=fare-fare*0.35;
	    	  }
		 		return  (int)fare;

	}

}
