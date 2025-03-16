package collectionsdemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Treesetdemoversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		treeSetOperations();
		
		treeSetOperationsAttempt2();

	}
	
	public static void treeSetOperations () {
		
		TreeSet treeSet = new TreeSet<>();
		
		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(25);
		
		System.out.println(treeSet);
		
		Iterator<Integer>iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(treeSet.size());
		
		System.out.println(treeSet.isEmpty());
		
		System.out.println(treeSet.contains(45));
		
		treeSet.remove(20);
		
		treeSet.forEach(num -> System.out.println(num));
		
		treeSet.clear();
		
		System.out.println(treeSet);
	}
	
	public static void treeSetOperationsAttempt2() {
		
		TreeSet<Integer> tSet = new TreeSet<>(Comparator.reverseOrder());
		
		tSet.add(1);
		tSet.add(2);
		tSet.add(3);
		tSet.add(4);
		tSet.add(5);
		
		System.out.println(tSet);
	}

}
