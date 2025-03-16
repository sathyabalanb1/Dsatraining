package collectionsdemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sortedSetOperations();

	}
	
	public static void  sortedSetOperations () {
		
		SortedSet<Integer>sortedSet = new TreeSet<>();
		
		sortedSet.add(5);
		sortedSet.add(10);
		sortedSet.add(15);
		sortedSet.add(20);
		sortedSet.add(25);
		
		for(Integer num: sortedSet) {
			System.out.println(num);
		}
		
		System.out.println(sortedSet.headSet(15));
		System.out.println(sortedSet.tailSet(15));
		
		System.out.println(sortedSet.subSet(5, 20));
		
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());
		
		System.out.println(sortedSet.contains(30));
		
		Iterator<Integer>iterator = sortedSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		System.out.println();
		
		System.out.println(sortedSet.size());
		
		sortedSet.remove(15);
		
		System.out.println(sortedSet);
		
		System.out.println(Arrays.toString(sortedSet.toArray()));
		
		sortedSet.clear();
		
		System.out.println(sortedSet);
		
	}

}
