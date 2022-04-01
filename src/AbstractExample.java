abstract class X{
	String str = "Zero";
	public abstract void m1();
	X(){
		System.out.println("One");
	}
}
abstract class Y{
	int y = 0;
}
class Z extends X{
	@Override
	public void m1() {
		String str = "Four";	
	}
}

public class AbstractExample{
	public static void main(String[] args) {
		Z obj = new Z();
		obj.m1();
		System.out.println(obj.str);
	}
	

	

}
