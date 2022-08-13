import java.util.Scanner;
//********************************************************************
//
//  Author:        Madeline Weber
//
//  Program #:     Hotel Occupancy 
//
//  File Name:     HotelOccupancy.java
//
//  Description:   Determines and displays how many rooms the hotel has, how many of them are occupied,
//  how many are unoccupied, and the percentage of rooms that are occupied. 
//  Originally created as part of a homework assingment. 
//
//********************************************************************

public class HotelOccupancy {
	//***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int number_of_Floors;
		double number_of_Rooms;
		double total_Rooms;
		int rooms_Occupied;
		double total_RoomsOccupied;
		double percentage_Occupancy;
		double total_Rooms_Unoccupied;
		int x; // count controller// Initalize variables
		total_Rooms = 0;
		total_RoomsOccupied = 0;
		rooms_Occupied = 0;
		total_Rooms_Unoccupied = 0;
		percentage_Occupancy = 0;

		System.out.print("Please enter the number of floors in the hotel: ");
		number_of_Floors = input.nextInt();
		
		// Validate that the number of floors is greater than or equal to 1
		while ( number_of_Floors < 1){
			System.out.print("Invalid number. Please enter an integer greater than 0: ");
			number_of_Floors = input.nextInt();}
		
		// Get the total number of rooms per floor and the number of rooms occupied
		for ( x = 0; x < number_of_Floors; x++){
			System.out.print("Enter the number of rooms on Floor " + (x + 1) + ": ");
			number_of_Rooms = input.nextInt();
			
			System.out.print("Enter the number of rooms occupied on Floor "+ (x + 1) + ": ");
			rooms_Occupied = input.nextInt();
			
			total_Rooms += number_of_Rooms;
			total_RoomsOccupied += rooms_Occupied;
 
		}
		
		// Calculate total occupancy rate and total vacancy rates 
		percentage_Occupancy = ( ( total_RoomsOccupied / total_Rooms ) * 100 );
		total_Rooms_Unoccupied = ( total_Rooms - total_RoomsOccupied );
		
		// Display occupancy rates 
		System.out.printf("Total rooms: %.0f%n", total_Rooms);
		System.out.printf("Total rooms occupied: %.0f%n",total_RoomsOccupied);
		System.out.printf("Total unoccupied: %.0f%n", total_Rooms_Unoccupied);
		System.out.printf("The percentage of rooms that are occupied is: %.1f%n", percentage_Occupancy, "%");
		}
	
	// End Program
}
