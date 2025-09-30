package Exception_1;

class InvalidPassword extends Exception{
	public InvalidPassword(String message) {
		super(message);
	}
}
class InvalidUsername extends Exception{
	public InvalidUsername(String message) {
		super(message);
	}
}

class check{
	private String name="Ayush";
	private String pass="A@123";
	String name_1,pass_1;
	public check() {
		this.name_1="";
		this.pass_1="";
	}
	void verify(String name,String pass) throws InvalidUsername,InvalidPassword{
		if(pass!=this.pass)
			throw new InvalidPassword("Wrong password");
		if(name!=this.name)
			throw new InvalidUsername("Wrong username");
		System.out.println("Login In Sucessfull");
	}
}
public class Customer_verification {
	public static void main(String[] args) {
		check ob=new check();
		try {
			ob.verify("Ayush","123");
		}
		catch(InvalidPassword e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidUsername e) {
			System.out.println(e.getMessage());
		}
	}
}
