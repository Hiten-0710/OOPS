package Programs;
import static java.lang.System.out;
import java.util.Deque;
import java.util.ArrayDeque;

public class deque {
public static void main(String[] args) {
	Deque<Integer> dq=new ArrayDeque<>();
	dq.add(456);
	dq.add(45);
	dq.add(46);
	dq.add(56);
	System.out.println(dq);
	dq.addLast(47896);
	System.out.println(dq);
}
}
