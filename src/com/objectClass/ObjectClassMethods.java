package com.objectClass;

public class ObjectClassMethods {
	private int pint = 1;
	int nint = 2;
	static int sint = 3;

	class NonStaticInnerClass {
		int a;
		String astr;

		public NonStaticInnerClass(int a, String astr) {
			this.a = a;
			this.astr = astr;
		}

		void displayOuterClassMembers() {
			System.out.println(pint);// Non Static Inner class can access private data members of outer class.
			System.out.println(nint);// Non Static Inner class can access default & public data members.
			System.out.println(sint);// Non Static Inner class can access static data member of outer class.
		}

	}
	static class StaticInnerClass {
		int b;// 
		String bstr;
		
		
		public StaticInnerClass(int b) {
			super();
			this.b = b;
			
		}

		void displayOuterClassMembers() {
//			System.out.println(pint);// Static Inner class can not access private data members of outer class.
//			System.out.println(nint);// Static Inner class can not access default & public data members.
			System.out.println(sint);// Static Inner class can access static data member of outer class.
		}
	}

	public static void main(String[] args) {
//		NonStaticInnerClass obj = new NonStaticInnerClass(1, "A");// To instantiate Non static Inner 
//		class outer class should be instantiated first. because object of non-static inner class is strongly
//		associated with outer class obect.
//		StaticInnerClass obj = new StaticInnerClass(2,"B");// Static inner class is not strongly associated with
//		outer class so static class can not refer directly instance variables or methods defined in enclosing
//		class.
//		So they can only be accessed through object refrence.
		ObjectClassMethods.StaticInnerClass obj = new ObjectClassMethods.StaticInnerClass(3);
		ObjectClassMethods.StaticInnerClass obj1 = new ObjectClassMethods.StaticInnerClass(3);
		obj1=obj;
		boolean bool = obj.equals(obj1);
		System.out.println(bool);
	}
}
