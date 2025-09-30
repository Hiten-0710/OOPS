package Programs;
import static java.lang.System.out;

class Inheritance {
	 int n;
	 Inheritance(){
		 this.n=10;
	 }
}
class inherit extends Inheritance{
	public static void main(String[] args) {
		done();
	}
	static void done() {
		super();
		out.println(super.n);
	}
}

