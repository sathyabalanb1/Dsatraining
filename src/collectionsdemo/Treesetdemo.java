package collectionsdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		treeSetOperations();
		
	//	treeSetOperationsAttempt2();

	}
	
	public static void treeSetOperations () {
		
		TreeSet<Integer>treeSet = new TreeSet<>();
		
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);
		
		for(Integer num: treeSet) {
			System.out.println(num);
		}
		
		System.out.println(treeSet.size());
		
		System.out.println(treeSet.contains(60));
		System.out.println(treeSet.contains(30));
		
		Iterator<Integer>iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(treeSet.isEmpty());
		
		System.out.println(Arrays.toString(treeSet.toArray()));
		
		treeSet.remove(40);
		
		System.out.println(treeSet);
		
		treeSet.forEach(num -> System.out.println(num));
		
	}
	
	public static void treeSetOperationsAttempt2 () {
		
		TreeSet<Integer>treeSet = new TreeSet<>(Comparator.reverseOrder());
		
		treeSet.add(11);
		treeSet.add(12);
		treeSet.add(13);
		treeSet.add(14);
		treeSet.add(15);
		
		System.out.println(treeSet);
		
		
	}

}
