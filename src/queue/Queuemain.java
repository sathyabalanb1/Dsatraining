package queue;

public class Queuemain {
	
	public static void main(String[] args) {
		
		Queue q1 = new Queue(5);
		
		q1.insert(50);
		q1.insert(60);
		q1.insert(70);
		q1.insert(80);
		
		System.out.println("------");
		
		q1.insert(90);
		
		System.out.println("------");
		
		q1.delete();
		
		q1.insert(90);
		
		System.out.println("-----");
		
		boolean ans;
		ans=q1.isFull();
		System.out.println(ans);
		
		System.out.println("--------");
		
		ans=q1.isEmpty();
		System.out.println(ans);
		
		System.out.println("-----------");
		
		q1.delete();
		q1.delete();
		q1.delete();
		q1.delete();
		
		System.out.println("---------");
		
		q1.delete();
		
		
	}
		
}
