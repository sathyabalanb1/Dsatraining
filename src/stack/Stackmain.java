package stack;

public class Stackmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack(5);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("-----------");
		s.push(60);
		
		System.out.println("-----------");
		
		boolean ans;
		ans=s.isEmpty();
		System.out.println(ans);
		
		System.out.println("----------");
		
		int poppedElement;
		while(!s.isEmpty()) {
			
			poppedElement = s.pop();
			
		}
		
		System.out.println("------------");
		
		int topElement;
		topElement=s.top();
		
		System.out.println("-----------");

	}

}
