
public abstract class A {
		int x = 10;
		public abstract void firstmethod();
		public void secondmethod()
		{
			System.out.println("Second");
			firstmethod();
		}

	}

class B extends A{

	@Override
	public void firstmethod() {
		System.out.println("First");
		
	}
	public void disp()
	{
		x = 15;
	}
	public static void main(String[] args)
	{
		B b = new B();
		b.firstmethod();
		b.secondmethod();
		b.disp();
		System.out.println(b.x);

	}
}