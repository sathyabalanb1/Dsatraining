package binarysearchtree;

public class Binarysearchtree {
	
	private Node root;
	
	public Binarysearchtree() {
		this.root=null;
	}
	
	public void insert (int n) {
		
		Node nn = new Node(n);
		
		if(this.root==null) {
			this.root=nn;
			return;
		}
		Node current=root;
		
		while(true) {
			if(nn.data<current.data) {
				if(current.left==null) {
					current.left=nn;
					return;
				}else {
					current=current.left;
				}
			}else {
				if(current.right==null) {
					current.right=nn;
					return;
				}else {
					current=current.right;
				}
			}
		}
	}
	
	public boolean search(int n) {
		
		Node current=root;
		
		while(current!=null) {
			if(n==current.data) {
				return true;
			}else if(n<current.data) {
				current=current.left;
			}else if(n>=current.data) {
				current=current.right;
			}
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		return this.root==null;
	}
	
	public class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.data=value;
			this.left=null;
			this.right=null;
		}
	}

}
