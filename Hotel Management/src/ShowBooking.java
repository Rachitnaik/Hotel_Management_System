/*
 * Author:	Kenrich Pinto
 * Roll No:	2044
 * Group:	Decoders
 * Project:	Hotel Management
 */

public class ShowBooking{

	LinkedList list = new LinkedList();
	
	public ShowBooking(LinkedList list2) {
		
		list = list2;
		//int c = list.count();
		System.out.println("Total bookings: " +list.count());
		list.printlist();
	}
}
