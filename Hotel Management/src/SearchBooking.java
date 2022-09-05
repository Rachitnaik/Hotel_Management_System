// Group Decoders
// 2012 Danish Dharwadkar
// Hotel Management System

import java.util.Scanner;

public class SearchBooking
{

	LinkedList list = new LinkedList();
	
	public SearchBooking(LinkedList list2)
 	{
		Scanner sc = new Scanner(System.in);
		
		list = list2;
		
		System.out.println("Enter the name to be searched: ");
		String name = sc.next();
		System.out.println("Name entered: " +name);
		String res =  list.search(name);
		if(res.length() > 0) 
		{
			System.out.println(res);
		}
		else 
		{
			System.out.println(" No Bookings Found ");
		}
	}
}
