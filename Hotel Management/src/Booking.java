class Booking extends Person{                                                             //2037 Rachit
	private Time book_time;
	private Room book_room;
	public Booking next;
	public Booking(String names,String c_mobile, int h, int m, int room_no, String room_type){
		super(names,c_mobile);
		book_time = new Time(h, m); // h is hours , m is minutes
		book_room = new Room(room_no, room_type);
	}
	
	public String readTime(){
		return book_time.toString();
	}
	
	public void resetFlight(int h, int m){
		book_time.reset(h, m);
	}
	
	public String getDetails(){
		return super.readPerson()+ " ,Booking Time : " +book_time+ " ,Room : " +book_room+ " \n";
	} 
	
	public void print(){
		System.out.print("[" +super.readPerson()+ " ,Booking Time : " +book_time+ " ,Room " +book_room+ " ]->");
	}	   
}