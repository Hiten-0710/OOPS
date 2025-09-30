package Programs;
import static java.lang.System.out;

class human{
	int age;
	int id;
	String name;
	static int population;
	human(int age,int id,String name){
		this.age=age;
		this.id=id;
		this.name=name;
		human.population+=1;	
	}
	human(){
		this.age=50;
		this.id=10;
		this.name="Dhruv";
	}
}

public class OOP {
	public static void main(String[] args) {
	human Ayush=new human(20,2024011,"Ayush");
	human Ram=new human(20,2024011,"Ram");
	out.println(Ram.population);
	}
}
