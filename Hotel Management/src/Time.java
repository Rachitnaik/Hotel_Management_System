class Time{
	private int hr, min;
	
	public Time(int h, int m){
		hr = h;
		min = m;
	}
 	
	public String toString(){
		return " " +hr+ ":" +min;
	}
	
	public void reset(int h, int m){
		hr=h;
		min=m;
	}
}