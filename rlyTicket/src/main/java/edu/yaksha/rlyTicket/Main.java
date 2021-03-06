package edu.yaksha.rlyTicket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	
	
    public static void main( String[] args )
    {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter From Location:");
    	 String fromLocation=scanner.nextLine();
    	 System.out.println("Enter To Location:");
    	 String toLocation=scanner.nextLine();
    	 System.out.println("Enter Normal Train fare:");
    	 int normalFare=Integer.parseInt(scanner.nextLine());
         System.out.println("Enter number of passengers:");
         int no=Integer.parseInt(scanner.nextLine());
         if(no>6 || no<1)
         {
        	 System.out.println("Sorry invalid number of passengers");
        	 System.exit(0);
         }
         ArrayList<Passenger> passengerList=new ArrayList<Passenger>();
         for(int i=0;i<no;i++)
         {
         System.out.println("Enter passenger details:");
    	 String passengerDetails=scanner.nextLine();
    	 String detailArr[]=passengerDetails.split(",");
    	 Passenger passenger=new Passenger(detailArr[0],Integer.parseInt(detailArr[1]));
    	 int fare=new TicketCalculate().fareCalculation(passenger,normalFare);
    	 passenger.setFare(fare);
    	 passengerList.add(passenger);
         }
         int totalFare=0;
         System.out.println("From:"+fromLocation+"   To:"+toLocation);
         for(Passenger passenger: passengerList)
         {
           totalFare=totalFare+passenger.getFare();
           System.out.println(passenger);
         }
         System.out.println("Total Amount payable:"+totalFare);
         
    }
}
