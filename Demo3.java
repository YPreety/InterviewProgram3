package output;

public class Demo3 {

	public static void main(String[] args) {
		foo(null);
	}

	public static void foo(Object o) {
		System.out.println("Object");
	}

	public static void foo(String  s) {
		System.out.println("String");
	}
	/*public static void foo(StringBuffer sb) {
		System.out.println("StringBuffer");
	}*/
}
