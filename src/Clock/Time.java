package Clock;

public class Time {
	
	private int seconds;
	
	public Time (int hr,int min,int sec) {
		this.seconds=hr*3600+min*60+sec;
	}
	
	public Time (int s) {
		this.seconds=s;
	}
	
	public int compareTo (Time t2) {
		
		if(this.seconds==t2.seconds) {
			return 0;
		}else if(this.seconds>t2.seconds) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public boolean isAM () {
		return this.seconds<43200;
	}
	
	public void print() {
		
		int hours = this.seconds/3600;
		int minutes = (this.seconds%3600)/60;
		int seconds = this.seconds%60;
		
		System.out.println(hours+":"+minutes+":"+seconds);
		return;
	}
	
	public boolean isEqual(Time t2) {
		return this.seconds==t2.seconds;
	}
	
	public Time duration (Time t2) {
		
		int dur = Math.abs(this.seconds-t2.seconds);
		
		return new Time(dur);
	}

}
