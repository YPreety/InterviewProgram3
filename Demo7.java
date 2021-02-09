package output;

class ParentUtil {

	public int x = 420;
	 protected int doStuff() { return x; }

}
public class Demo7 extends ParentUtil  {
public static void main(String [] args) {
new Demo7().callStuff();
 }

void callStuff() {
System.out.print("this " + this.doStuff() );
ParentUtil p = new ParentUtil();
System.out.print(" parent " + p.doStuff() );
}
}