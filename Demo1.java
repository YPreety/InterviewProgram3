package output;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(20);
		System.out.println(v.capacity());
		System.out.println(v.size());

		v.addElement("abc");
		Vector v1 = new Vector();
		v1 = (Vector) v.clone();
		v.insertElementAt("d", 0);
		System.out.println(v1.contains("d"));
	}

}
