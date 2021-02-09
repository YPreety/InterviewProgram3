package output;

public class Demo2 {

	public static void doPrint(A o) {
		o.m();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
	    //A a1 = new B(); // Compiler error can't convert B to A
		B b = new B();
		doPrint(a);
		//doPrint(b); // compiler error there no such method for output
	}
}

class A {
	public void m() {
		System.out.println("A");
	}
}

class B {
	public void m() {
		System.out.println("B");
	}
}