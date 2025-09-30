package Programs;
import static java.lang.System.out;
import java.util.HashMap;

//1 Program

//class stu{
//	String name;
//	int roll;
//	private static stu in;
//	private stu(String name,int roll){
//		this.name=name;
//		this.roll=roll;
//	}
//	public static stu ins() {
//		if(in==null)
//		in= new stu("hi",1);
//		return in;
//		
//	}
//	void read() {
//		out.println("Reading....");
//	}
//	void write() {
//		out.println();
//	}
//}
//public class oop_class_1{
//	public static void main(String[] args) {
//		stu obj=stu.ins();
//		stu obj1= stu.ins();
//		out.println(obj1.name);
//		out.println(obj.name);
//		obj.read();
//		obj.write();
//	}
//}


//2 Program


class A{
	String name="Ram";
	float roll=1f;
	int marks=100;
	void show() {
		out.println(name+" "+roll);
	}
	
}
class B extends A{
	void display() {
		out.println("Baccha");
	}
}

class C extends B{
	void add() {
		out.println("Pota class");
	}
}

public class oop_class_1{
	public static void main(String[] args) {
		C o=new C();
		out.println(o.name);
		out.println(o.roll);
		o.show();
		o.display();
		o.add();
		ji obj=new ji();
		obj.map();
		out.println(o.marks);
	}
}















class ji{
	void map() {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(10,"Chalbe chotu");
		out.println(map.get(10));
	}
	
}





