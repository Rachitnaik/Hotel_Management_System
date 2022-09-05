// Group Decoders
// 2012 Danish Dharwadkar
// Hotel Management System

import java.util.Scanner;

public class DeleteBooking
{

	LinkedList list = new LinkedList();
	public DeleteBooking(LinkedList list2) 
	{
		Scanner sc = new Scanner(System.in);
		
		list = list2;
		
		System.out.println("1) Delete single entry\n2) Delete all entries");
		int choice = sc.nextInt();
		
		if(choice == 1)
			list.delete_first();
		else
			list.delete_all();
	}
}
