package collectionsdemo;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedsetdemoverstiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sortedSetOperations();

	}
	
	public static void sortedSetOperations () {
		
		SortedSet<String>sortedSet = new TreeSet<>();
		
		sortedSet.add("sathya");
		sortedSet.add("bala");
		sortedSet.add("cathrine");
		sortedSet.add("yohan");
		sortedSet.add("divya");
		
		System.out.println(sortedSet);
		
		System.out.println(sortedSet.subSet("bala", "sathya"));
		
		Iterator<String>iterator = sortedSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(sortedSet.contains("bavithra"));
		
		System.out.println(sortedSet.headSet("divya"));
		System.out.println(sortedSet.tailSet("divya"));
		
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());
		
		sortedSet.remove("cathrine");
		
		System.out.println(sortedSet);
		
		sortedSet.clear();
		
		System.out.println(sortedSet);
	}

}
