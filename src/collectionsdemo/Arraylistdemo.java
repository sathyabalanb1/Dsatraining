package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayListDemo();

	}
	
	public static void arrayListDemo () {
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.size());
		
		for(Integer num: list) {
			System.out.println(num);
		}
		
		list.set(3, 35);
		
		System.out.println(list);
		
		list.add(5, 55);
		
		System.out.println(list);
		
		list.add(2, 25);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.isEmpty());
		
		Iterator<Integer>iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(list.contains(125));
		
		int output[] = list.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(output));
		
		int temp[] = {2,7,9,13,15};
		
		List<int[]>listArray = Arrays.asList(temp);
		
		List<Integer>dummyList = Arrays.asList(6,9,12,3,6);
		
		System.out.println(dummyList);
		
	//	ArrayList<Integer>tempList = new ArrayList<>(Arrays.asList(temp));
		
	}

}
