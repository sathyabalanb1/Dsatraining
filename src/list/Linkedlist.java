package list;

public class Linkedlist {
	
	private Node head;
	private Node tail;
	
	public Linkedlist() {
		this.head=head;
		this.tail=tail;
	}
	
	public void insert (int n) {
		
		Node nn = new Node(n);
		
		if(tail==null) {
			tail=nn;
		}else {
			head.next=nn;
		}
		head=nn;
		System.out.println( head.data+" New node is inserted into list");
		return;
	}
	
	public int delete() {
		
		if(tail==null) {
			System.out.println("List is Empty! Cannot delete");
			return -1;
		}
		
		int d = tail.data;
		tail = tail.next;
		
		if(tail==null) {
			head=null;
		}
		
		System.out.println(d+" Node is successfully removed from the list");
		return d;
	}
	
	public boolean isEmpty() {
		
		return tail==null && head==null;
	}
	
	public class Node{
		int data;
		Node next;
		
		public Node(int n) {
			this.data=n;
			this.next=null;
		}
	}

}
