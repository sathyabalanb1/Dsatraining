package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemoversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayListDemo();

	}
	
	public static void arrayListDemo () {
		
		ArrayList<Integer>arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(20);
		arrayList.add(25);
		
		System.out.println(arrayList.get(2));
		
		System.out.println(arrayList);
		
		arrayList.add(2, 13);
		
		for(Integer num: arrayList) {
			System.out.println(num);
		}
		
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains(15));
		
		Iterator<Integer>iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<Integer>temp = Arrays.asList(1,2,3,4,5);
		System.out.println(temp); 
		
		int temp1[] = {2,4,6,8,10};
		List<int[]>list = Arrays.asList(temp1);
		
		int tempArray[] = temp.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(tempArray));
		
		List<Integer>secondlist = Arrays.asList(51,52,53,54,55);
		Object secondArray[] = secondlist.toArray();
		System.out.println(Arrays.toString(secondArray));
		
		List<Integer>thirdList = Arrays.asList(91,92,93,94,95);
		Integer thirdArray[] = thirdList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(thirdArray));
		
	}

}
