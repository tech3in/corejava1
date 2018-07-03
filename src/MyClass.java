
public class MyClass extends MyParentClass implements IClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		
		//myClass.showFullName();
		myClass.showMyName();
		
		MyParentClass myParentClass = new MyParentClass();
		myParentClass.showMyName();
		
		MyAbsClass absClass = new MyAbsClass() {
			
			@Override
			public void printName(String incomingObj) {
				// TODO Auto-generated method stub
				System.out.println(incomingObj);
			}
		};
		absClass.printHello("Hello");
		System.out.println(IClass.HELLO);
		//IClass.hello = "hagsjhgfa";
	}
	
	private String myName;
	
	private void showFullName() {
		
		myName = "Vasudev";
		System.out.println(myName);
	}
	
	@Override
	public void showMyName() {
		
		super.showMyName();
		System.out.println("Vasudev");
	}

	@Override
	public void helloWorld() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
