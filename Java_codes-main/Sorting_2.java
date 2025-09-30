package Programs;
import static java.lang.System.out;
import java.util.*;

class B implements Comparator<Integer>{
	@Override
	public int compare(Integer i,Integer j) {
		if(i%10>j%10)
		return 1;
		else return -1;
	}
}

public class Sorting_2 {
    public static void main(String[] args) {
        System.out.println("Loaded class B from: " + B.class.getProtectionDomain().getCodeSource().getLocation());

        List<Integer> l = new ArrayList<>(Arrays.asList(
            45, 5, 4, 4555, 48785, 885, 4502, 45022, 4522
        ));

        out.println("|------Before Sorting------|");
        out.println(l);

        out.println("|------After Sorting------|");
        Collections.sort(l);
        out.println(l);

        out.println("|------After Custom Sorting------|");
        Collections.sort(l, new B());
        out.println(l);
    }
}
