package Programs;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;



public class queue {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		System.out.println("Queue LinkedList : ");
		q.add(5);
		q.add(6);
		q.add(55);
		q.add(54);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.add(458);
		System.out.println(q);
		
		System.out.println("-------------------------");
		
		Queue<Integer> q1=new PriorityQueue<>();
		System.out.println("Queue PriorityQueue : ");
		q1.add(5);
		q1.add(6);
		q1.add(55);
		q1.add(54);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		q1.add(458);
		System.out.println(q1);
		System.out.println(q1.contains(6));
		System.out.println(q1.poll());
		System.out.println(q1.contains(26));	
		System.out.println("-------------------------");
		
		Queue<Integer> q2=new ArrayDeque<>();
		System.out.println("Queue ArrayDeque : ");
		q2.add(25);
		q2.add(125);
		q2.add(225);
		q2.add(253);
		q2.add(257);
		q2.add(255);
		System.out.println(q2);
		

	}
}
