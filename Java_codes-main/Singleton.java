package Programs;
import static java.lang.System.out;

class single{
	int n;
	private single(){}
	private static single instance;
	public static single get_ins() {
		if(instance==null)
			instance=new single();
		return instance;
	}
}

public class Singleton {
	public static void main(String[] args) {
	single obj1= single.get_ins();
	single obj2= single.get_ins();
	single obj3= single.get_ins();
	obj1.n=1;
	obj2.n=2;
	obj3.n=3;
	out.println(obj1.n+" "+obj2.n+" "+obj3.n);
	
	}
}
