package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemoverstiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashMapOperations();

	}
	
	public static void hashMapOperations () {
		
		HashMap<Integer,String>hashMap = new HashMap<>();
		
		hashMap.put(101, "vetri");
		hashMap.put(102, "saravanan");
		hashMap.put(103, "bhargavan");
		hashMap.put(104, "ravi");
		hashMap.put(105, "mani");
		
		System.out.println(hashMap.get(104));
		
		for(Map.Entry<Integer, String>entry:hashMap.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
		System.out.println(hashMap);
		
		hashMap.forEach((key,value) -> System.out.println(key+"::"+value));
		
		System.out.println(hashMap.containsKey(103));
		System.out.println(hashMap.containsValue("sathya"));
		
		hashMap.remove(104);
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.size());
	}

}
