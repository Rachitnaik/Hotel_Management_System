/*
 * Author:	Kenrich Pinto
 * Roll No:	2044
 * Group:	Decoders
 * Project:	Hotel Management
 * Class:	Contains various functions to perform operations on the linked list
 */

class LinkedList{
        private Booking head;
        
	    public  LinkedList(){
	    	head = null;
	    }
	    
	    //function to insert a node into the linked list
		public void insert(String name, String contact, int hour, int minute, int roomNumber, String roomTime){
			Booking temp = new Booking(name, contact, hour, minute, roomNumber, roomTime);
			temp.next = head;
			head = temp;
		}
       
		public  Booking readBook(int el){
			if ((head == null) || (this.count() < el))
				return null;
			Booking temp = head;
			int current = 1;
			while(current != el) {
				current++;
				temp = temp.next;
			}
			return temp;
		}
		
		//function to count the number of nodes in the list
		public int count(){
			Booking temp = head;
            int res = 0;
            while(temp != null){
            	res++;
            	temp = temp.next;
            }
            return res;
		}
		
		//function to delete the first entry in the list
		public String delete_first(){
			if (head == null)
				return null;
			String result = head.readPerson();
			head = head.next;
			return result;
		}
		
		//function to delete all entries in the list
		public void delete_all(){
			head = null;
		}
		
		//function to display the entire list
	    public void printlist(){
	    	 Booking temp = head;
	    	 System.out.println("\nBookings:");
	    	 while(temp != null) {
	    		 temp.print();
	    		 temp = temp.next;
	    	 }
	     }
	     
	    /*
	     public String getlist(){
	    	 String res = "";
	    	 Booking temp = head;
   
	    	 while(temp != null) {
	    		 res += temp.getDetails();
	    		 temp = temp.next;
	    	 }
	    	 return res;
	     }*/
	     
	     public String search(String s1){     
	    	 Booking temp = head;
	    	 String res = "";
	    	 while(temp != null){
	    		 if(temp.readName().equals(s1))
	    			 res = temp.getDetails();
	    		 temp=temp.next;
	    	 }
	    	 return res;
	     }
}