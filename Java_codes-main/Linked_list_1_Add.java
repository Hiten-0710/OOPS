package Programs;
import static java.lang.System.out;
import java.util.Scanner;

class Link {
	int data;
	Link next;
	Link(){
		this.next=null;
		this.data=0;
	}
	Link(Link next,int data){
		this.next=next;
		this.data=data;
	}
}


public class Linked_list_1_Add {
    static Link add(Link head, int data){
    if(head==null){
    head=new Link(null,data);
    return head;
    }
    Link temp=head;
    while(temp.next!=null)
    temp=temp.next;
    temp.next=new Link(null,data);
    return head;
}
static void display(Link head){
    Link temp=head;
    while(temp!=null){
        out.print(temp.data+" --> ");
        temp=temp.next;
    }
    out.println("end");
}
	public static void main(String[] args) {
		 Link head=null;
		 Scanner sc=new Scanner(System.in);
		 int n=0;
		 while(true) {
			 n=sc.nextInt();
			 if(n==-1)
				 break;
			 head=add(head,n);
		 }
		 display(head);
	}
}