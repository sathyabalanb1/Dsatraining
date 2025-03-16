package collectionsdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linkedListDemo();

	}
	
	public static void linkedListDemo () {
		
		LinkedList<Integer>list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		list.addFirst(1);		
		System.out.println(list);
		
		list.addLast(50);
		System.out.println(list);
		
		list.add(2, 25);		
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.forEach(num->System.out.print(num+","));
		System.out.println();
		
		list.remove(2);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains(95));
		
		List<Integer>secondList = Arrays.asList(93,95,91,94,92);
		System.out.println(secondList);
		Collections.sort(secondList);
		System.out.println(secondList);
		
		List<Integer>thirdList = Arrays.asList(71,72,73,74,75);
		System.out.println(thirdList);
		Collections.reverse(thirdList);
		System.out.println(thirdList);
		
		
		List<Integer>fourthList = Arrays.asList(61,62,63,64,65);
		Object objArray[] = fourthList.toArray();
		System.out.println(Arrays.toString(objArray));
		
		List<Integer>fifthList = Arrays.asList(121,122,123,124,125);
		int fifthArray[]= fifthList.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(fifthArray));
		
		int temp[] = {16,17,18,19,20};
		List<int[]>firstListArray = Arrays.asList(temp);
		
		
	}

}
