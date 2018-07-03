
public abstract class MyAbsClass {
	
	public abstract void printName(String incomingName);
	public void printHello(String name) {
		
		System.out.println(name);
		printName("Hello.."+name);
	}
	
	

}
