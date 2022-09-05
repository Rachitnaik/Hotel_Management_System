
class Person{
	public String name;
	public String ct;
	
	public Person(String n, String c){
		name=n;
		ct = c;}
	
	public String readName() {
		return name;
	}
	
	
	public String readPerson(){return "\nName : " + name + ", Contact : " + ct ;}
}

