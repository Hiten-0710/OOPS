package Exception_1;

public class C1 {
	public static void main(String []args) {
	try {
	System.out.println(1/0);
	}
	catch(ArithmeticException e) {
		System.out.print("Error Occured");
	}
	}
	}
