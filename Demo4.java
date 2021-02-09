package output;

public class Demo4 {

	public static void main(String[] args) {
		A4 a = new B4();
		a.getData();
		
		A4 a1 = new A4();
		a1.getData();
		
		B4 b = new B4();
		b.getData();
		
		
	}
}

class A4 {
	protected void getData() {
		System.out.println("inside A getData()");
	}
}

class B4 extends A4 {
	protected void getData() {
		System.out.println("inside B getData()");
	}

	protected void show() {
		System.out.println("inside B show()");
	}
}