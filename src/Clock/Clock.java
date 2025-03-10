package Clock;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time tme1 = new Time(5,15,24);
		Time tme2 = new Time(8,23,12);
		
		boolean ans;
		ans=tme1.isAM();
		System.out.println(ans);
		
		tme2.print();
		
		ans=tme1.isEqual(tme2);
		System.out.println(ans);
		
		int timeCompare;
		timeCompare=tme1.compareTo(tme2);
		System.out.println(timeCompare);
		
		Time duration;
		duration=tme1.duration(tme2);
		duration.print();

	}

}
