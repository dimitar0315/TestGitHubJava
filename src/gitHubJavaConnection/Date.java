package gitHubJavaConnection;

public class Date {
	
	int sec;
	int min;
	int hour;
	int day;
	int month;
	int year;
	
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int _sec) {
		sec = _sec;
	}
	
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int _min) {
		min = _min;
	}
	
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int _hour) {
		hour = _hour;
	}
	
	
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int _day) {
		day = _day;
	}
	
	
	
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int _month) {
		month = _month;
	}
	
	
	
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int _Year) {
		year = _Year;
	}
	
	
	
	
	public int compareToYear(Date anotherDate) {
		
		if(year > anotherDate.year) {
			return 1;
		}else if(year < anotherDate.year ) {
			return -1;
		}else {
			return compareToMonth(anotherDate);
		}
		
		
	}

	private int compareToMonth(Date anotherDate) {
		// TODO Auto-generated method stub
		
		if(month > anotherDate.month) {
			return 1;
		}else if(month < anotherDate.month) {
			return -1;
		}else {
			return compareToDay(anotherDate);
		}
		
		
	}

	private int compareToDay(Date anotherDate) {
		// TODO Auto-generated method stub
		if(day > anotherDate.day) {
			return 1;
		}else if(day < anotherDate.day) {
			return -1;
		}else {
			return compareToHour(anotherDate);
		}
		
		
	}

	private int compareToHour(Date anotherDate) {
		// TODO Auto-generated method stub
		
		if(hour > anotherDate.hour) {
			return 1;
		}else if(hour < anotherDate.hour) {
			return -1;
		}else {
			return compareToMin(anotherDate);
		}
		
		
	}

	private int compareToMin(Date anotherDate) {
		// TODO Auto-generated method stub
		
		if(min > anotherDate.min) {
			return 1;
		}else if(min < anotherDate.min) {
			return -1;
		}else {
			return compareToSec(anotherDate);
		}
		
		
	}

	private int compareToSec(Date anotherDate) {
		// TODO Auto-generated method stub
		
		if(sec > anotherDate.sec) {
			return 1;
		}else if(sec < anotherDate.sec) {
			return -1;
		}else {
			return 0;
		}
		
		
	}
	
	
	
	
	
	

}
