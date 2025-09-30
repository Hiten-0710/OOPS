package Programs;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(45);
		l.add(5);
		l.add(4);
		l.add(4555);
		l.add(48785);
		l.add(885);
		l.add(4502);
		l.add(45022);
		l.add(4522);
		out.println("-----Before Sorting------");
		out.println(l);
		out.println("-----After Sorting------");
		Collections.sort(l);
		out.println(l);
	}
}
