package list;

public class Linkedlistmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist ll = new Linkedlist();
		
		ll.delete();
		
		System.out.println("-------");
		
		ll.insert(5);
		ll.insert(10);
		ll.insert(15);
		ll.insert(20);
		
		System.out.println("------");
		
		while(!ll.isEmpty()) {
			ll.delete();
		}
		
		System.out.println("--------");
		
		boolean ans;
		ans=ll.isEmpty();
		System.out.println(ans);

	}

}
