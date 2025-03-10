package binarysearchtree;

import java.util.Arrays;
import java.util.List;

public class Binarysearchtreemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binarysearchtree b1 = new Binarysearchtree();
		
		boolean ans;
		ans=b1.isEmpty();
		System.out.println(ans);
		
		List<Integer>input = Arrays.asList(52,24,79,90,35,14,20,9,12,65,86);
		
		for(int val:input) {
			b1.insert(val);
		}
		
		ans= b1.isEmpty();
		System.out.println(ans);
		
		boolean exist;
		exist=b1.search(97);
		System.out.println(exist);
		
		exist=b1.search(35);
		System.out.println(exist);
		
	}

}
