/*
 Author: Vaibhav Kamath
 Roll no: 2030
 Group : Decoders
*/

import java.util.Scanner;

public class MyFrame {
	private LinkedList list=new LinkedList();

	public MyFrame(String s){
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		System.out.println("Hotel Booking Application");
		
		do {
			System.out.println("\n1) Add Booking\n2) Show Bookings");
			System.out.println("3) Search Booking\n4) Delete Bookings");
			System.out.println("5) Exit");
			choice = sc.nextInt();
			
			switch(choice) {        // menu driven program which lets user add booking,show booking, search booking, delete booking as per his/her choice of input
				case 1:
					AddBooking addbook = new AddBooking(list);
					break;
				case 2:
					ShowBooking showbook = new ShowBooking(list);
					break;
				case 3:
					SearchBooking searchbook = new SearchBooking(list);
					break;
				case 4:
					DeleteBooking deletebook = new DeleteBooking(list);
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid option. Enter choice from 1-4");
					break;
			}
		}while(choice != 5);
	}

}
