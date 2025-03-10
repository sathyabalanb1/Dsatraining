package stack;

public class Stack {
	
	private int top;
	private int maxSize;
	private int stackArray[];
	
	public Stack (int n) {
		this.top=-1;
		this.maxSize=n;
		this.stackArray=new int[maxSize];
	}
	
	public void push(int value) {
		if(top==maxSize-1) {
			System.out.println("Stack Overflow");
			return;
		}
		stackArray[++top]=value;
		System.out.println(value+" pushed into stack");
		return;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return-1;
		}
		
		int poppedElement = stackArray[top--];
		System.out.println(poppedElement+" popped from the stack");
		return poppedElement;
	}
	
	public int top() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}

}
