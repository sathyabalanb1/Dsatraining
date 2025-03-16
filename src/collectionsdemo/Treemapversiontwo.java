package collectionsdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Treemapversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		treeMapVersionTwo();

	}
	
	public static void treeMapVersionTwo () {
		
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		
		treeMap.put(201, "gowtham");
		treeMap.put(202, "varun");
		treeMap.put(203, "madheesh");
		treeMap.put(204, "aadhithya");
		treeMap.put(205, "prasanna");
		
		System.out.println(treeMap.get(204));
		
		System.out.println(treeMap);
		
		System.out.println(treeMap.size());
		
		for(Map.Entry<Integer, String>entry:treeMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println(treeMap.containsKey(206));
		System.out.println(treeMap.containsValue("aadhithya"));
		
		System.out.println(treeMap.floorKey(204));
		
		for(Integer k : treeMap.keySet()) {
			System.out.println(k+"::"+treeMap.get(k));
		}
		
		System.out.println(treeMap.ceilingKey(206));
	}

}
