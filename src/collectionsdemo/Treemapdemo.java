package collectionsdemo;

import java.util.Map;
import java.util.TreeMap;

public class Treemapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		treeMapOperations();

	}
	
	public static void treeMapOperations () {
		
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		
		treeMap.put(101, "cathrine");
		treeMap.put(102, "gowtham");
		treeMap.put(103, "yohan");
		treeMap.put(104, "ragu");
		treeMap.put(105, "lokeshwari");
		
		System.out.println(treeMap.get(105));
		
		for(Integer key: treeMap.keySet()) {
			System.out.println(key+","+treeMap.get(key));
		}
		
		System.out.println(treeMap);
		
		treeMap.forEach((k,v)->System.out.println(k+":"+v));
		
		System.out.println(treeMap.containsKey(103));
		System.out.println(treeMap.containsValue("lavanya"));
		
		for(Map.Entry<Integer, String>entry:treeMap.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
		TreeMap<Integer,String> subMap = new TreeMap<>(treeMap.subMap(102, 105));
		
		System.out.println(subMap);
		
		treeMap.remove(105);
		System.out.println(treeMap);
		
		System.out.println(treeMap.floorKey(106));
		System.out.println(treeMap.floorKey(103));
		
		System.out.println(treeMap.ceilingKey(105));
		System.out.println(treeMap.ceilingKey(101));
	}

}
