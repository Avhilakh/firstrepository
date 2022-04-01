
public class BaserefDerived {
	
	public static void main(String[] args) {
		Base b = new Derived();
		b.i = 20;
		//b.j = 20;
		b.h = 20;
		//b.k = 20;
	
	}

}

class Base{
	static int i = 10;
	int h = 0;
	Base(){
		System.out.println("Inside Base");
		int x = (int)(7/((double)2)+3.5);
		System.out.println(x);
		
	}
	public static void show() {
		System.out.println("Show Base");
	}
}

class Derived extends Base{
	static int j = 20;
	public int k = 0;
	Derived(){
		System.out.println("Inside Derived");
		
	}
	public static void show() {
		System.out.println("Show Derived");
	}
}