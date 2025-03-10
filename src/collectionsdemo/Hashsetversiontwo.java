package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashSetDemo();

	}
	
	public static void hashSetDemo () {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("reshma");
		hashSet.add("monisha");
		hashSet.add("srimathi");
		hashSet.add("kavinila");
		hashSet.add("reshma");
		
		System.out.println(hashSet);
		
		for(String name:hashSet) {
			System.out.println(name);
		}
		
		System.out.println(hashSet.size());
		
		Iterator<String> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(hashSet.contains("suganya"));
		System.out.println(hashSet.contains("srimathi"));
		
		hashSet.remove("kavinila");
		
		hashSet.stream().forEach(System.out::println);
		
		hashSet.clear();
		
		System.out.println(hashSet);
	}

}
