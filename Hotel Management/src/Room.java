class Room{
	private int numbr;
	private String type;
	
	public Room(int n, String t){
		numbr=n;
		type=t;
	}
	
	public String toString(){
		return "Number : "+numbr+" ,Type : "+type;
	}
}