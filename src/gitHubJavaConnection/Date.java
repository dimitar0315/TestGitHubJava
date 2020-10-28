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
	
	//за когато потрбителя го мързи
	public Date() {
		sec = 30;
		min = 50;
		hour = 12;
		day = 20;
		month = 12;
		year = 1969;
	}
	
	
	
	
	//това се появи когато натиснах десен бутон Source-> generate construktor
	public Date(int sec, int min, int hour, int day, int month, int year) {
		super();
		this.sec = sec;
		this.min = min;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
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
	
	
	
	
	
	public String wisokosna() {
		if(year%4==0) {
			return "Wisokosna";
		}else {
			return "Ne wisokosna";
		}
	}
	
	
	public int curDay() {
		
		int numDay = 0;
		
		if(month == 1) {
			return day;
		}else {
			if(wisokosna() == "Wisokosna") {
				for(int i = 1; i<= this.month; i++) {
						if(i==2) {
							numDay+=29;
						}else if(i%2==0) {
							numDay+=30;
						}else {
							numDay+=31;
						}	
						
					}
				return numDay+day;
					
			}else {
				for(int i = 1; i< this.month; i++) {
					
						if(i==2) {
							numDay+=28;
						}else if(i%2==0) {
							numDay+=30;
						}else {
							numDay+=31;
						}
				}
				return numDay+day;
			}
			
		}
		
		
	}
	
	
	public int curWeek() {
		int a = curDay();
		int d = a/7;
		if(a%7==0) {
			return d;
		}else {
			return d+1;
		}
		
	}
	
	

}
