package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashMapDemo();

	}
	
	public static void hashMapDemo () {
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		
		hashMap.put(101, "sathya");
		hashMap.put(102, "hari");
		hashMap.put(103, "ramkumar");
		hashMap.put(104, "kavin");
		hashMap.put(105, "yohan");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(104));
		
		hashMap.forEach((key,value)-> System.out.println(key+":"+value));
		
		for(Map.Entry<Integer,String>entry: hashMap.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
		System.out.println(hashMap.containsKey(106));
		System.out.println(hashMap.containsValue("kavin"));
		
		hashMap.remove(102);
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.size());
	}

}
