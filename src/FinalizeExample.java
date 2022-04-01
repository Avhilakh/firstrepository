
public class FinalizeExample {
	protected void finalize() {
		System.out.println("Trisect");
		
	}
	final static int INT;
	static {
		INT = 10;
	}
//	INT = 10;
	public static void main(String[] args) {
		FinalizeExample obj = new FinalizeExample();
//		FinalizeExample.INT = 10;
		FinalizeExample a,b,c,d;
		a = new FinalizeExample();
		b = new FinalizeExample();
		c = a;
		a = null;
		b = null;
		d = null;
		c = null;
		System.gc();
		System.out.println("Inst");
	}
}
