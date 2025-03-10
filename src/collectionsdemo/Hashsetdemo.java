package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashSetDemo();

	}
	
	public static void hashSetDemo () {
		
		HashSet<String>names = new HashSet<>();
		
		names.add("sathya");
		names.add("bala");
		names.add("mani");
		names.add("ramkumar");
		names.add("sathya");
		
		System.out.println(names);
		
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println(names.size());
		
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(names.contains("bavithra"));
		
		System.out.println(names.contains("ramkumar"));
		
		names.remove("ramkumar");
		
		System.out.println(names);
		
		names.stream().forEach(System.out::println);
		
		names.clear();
		
		System.out.println(names);
		
		
	}

}
