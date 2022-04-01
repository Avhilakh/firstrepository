
class CountingObjects extends Parent {
	public void mymethod(int a, int b) {
		System.out.println("Shaka");
		}
	
	public static void main(String[] args) {
		CountingObjects obj = new CountingObjects();
		obj.mymethod(10,20);
		
		obj.i = 10;
		System.out.println(obj.i);
	}

}
abstract class Parent {
	int i;
	public abstract void mymethod(int a, int b);
}