package Programs;
import static java.lang.System.out;


public class oop_class_2 extends C {
	public static void main(String[] args) {
		C o=new C();
		out.println(o.name+" "+o.roll+" ");
		o.add();
		o.display();
	}
}
