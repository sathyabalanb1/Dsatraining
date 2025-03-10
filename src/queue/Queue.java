package queue;

public class Queue {
	
	private int a[];
	private int head;
	private int tail;
	private int size;
	
	public Queue(int capacity) {
		this.a=new int[capacity];
		this.head=0;
		this.tail=0;
		this.size=0;
	}
	
	public void insert(int n) {
		if(isFull()) {
			System.out.println("Queue is Full! cannot insert "+n);
			return;
		}
		
		a[head]=n;
		head = (head+1)%a.length;
		size++;
		System.out.println(n+" inserted into queue");
		return;
	}
	
	public int delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty! cannot delete");
			return -1;
		}
		int removed = a[tail];
		tail=(tail+1)%a.length;
		size--;
		System.out.println(removed+ " is removed from the queue");
		return removed;
	}
	
	public boolean isFull() {
		return this.size==a.length-1;
	}
	
	public boolean isEmpty() {
		return size==0;
	}

}
