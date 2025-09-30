package Programs;
import static java.lang.System.out;

class block{
	static int a=4;
	static int b;
//	Runs once when first object is created
	static {
		b=a*5;
	}
}

public class Static_block {	
	public static void main(String[] args) {
		block obj=new block();
		out.println(obj.a+" "+obj.b);
		obj.b+=3;
		out.println(obj.a+" "+obj.b);
		block obj2=new block();
		out.println(obj2.a+" "+obj2.b);
	}
}
