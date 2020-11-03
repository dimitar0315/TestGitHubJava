package gitHubJavaConnection;

public class Date {
	
	int seconds;
	int minutes;
	int hour;
	int day;
	int month;
	int year;
	
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int _seconds) {
		
		if(_seconds>=60) {
			seconds = _seconds-60;
		}else {
			seconds = _seconds;
		}
		
		
	}
	
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int _minutes) {
		
		if(_minutes>=60) {
			minutes = _minutes;
		}
		
		minutes = _minutes;
	}
	
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int _hour) {
		
		if(_hour>=24) {
			hour = _hour-24;
		}else {
			hour = _hour;
		}
		
		
	}
	
	
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int _day) {
		
		if(_day>=365) {
			day = _day - 365;
		}else {
			day = _day;
		}
		
		
	}
	
	
	
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int _month) {
		
		if(_month>=13) {
			month = _month - 12;
		}else {
			month = _month;
		}
	}
	
	
	
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int _Year) {
		year = _Year;
	}
	
	//за когато потрбителя го мързи
	public Date() {
		seconds = 30;
		minutes = 50;
		hour = 12;
		day = 20;
		month = 12;
		year = 1969;
	}
	
	
	
	
	//това се появи когато натиснах десен бутон Source-> generate construktor
	public Date(int sec, int min, int hour, int day, int month, int year) {
		super();
		this.seconds = sec;
		this.minutes = min;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public boolean leapYear() {
		if (year%4==0 && (year%100!=0 || year%400==0)) {
			return true;
		}else {
			return false;
		}
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
			return compareToMinutes(anotherDate);
		}
	}

	private int compareToMinutes(Date anotherDate) {
		// TODO Auto-generated method stub
		
		
		if(minutes > anotherDate.minutes) {
			return 1;
		}else if(minutes < anotherDate.minutes) {
			return -1;
		}else {
			return compareToSeconds(anotherDate);
		}
	}

	private int compareToSeconds(Date anotherDate) {
		// TODO Auto-generated method stub
		
		if(seconds > anotherDate.seconds) {
			return 1;
		}else if(seconds < anotherDate.seconds) {
			return -1;
		}else {
			return 0;
		}		
	}
	
	public int currentDay() {
		
		int numberOfDays = 0;
		
		if(month <=7) {
			for(int i = 1; i<=month; i++) {
				if(leapYear()== true) {
					if(i == 2) {
						numberOfDays +=29;
					}else if(i%2==0) {
						numberOfDays +=30;
					}else {
						numberOfDays +=31;
					}
				}
			}
		}else {
			if(leapYear()== true) {
				numberOfDays += 182;
			}else {
				numberOfDays +=181;
			}
			for(int i = 7; i<=month; i++) {
				if(i%2==0) {
					numberOfDays +=30;
				}else {
					numberOfDays +=31;
				}
			}
		}
		return numberOfDays+day;
	}
	
	
	
	public int currentWeek() {
		int s = currentDay();
		
		if(s%7==0) {
			return s/7;
		}else {
			return (s/7)+1;
		}
	}
	
	
	
	public int plus1Second() {
		return seconds+1;
	}
	
	public int dayDifferrence(Date other) {
		return 0;
	}
	
	
	public DaysOfWeek dayOfWeek() {
		int daysToMonday = dayDifferrence(someMonday);
		if (daysToMonday >= 0)
			return DaysOfWeek.getDay(daysToMonday+1);
		else
			return DaysOfWeek.getDay((7-(-daysToMonday)%7));
	}
	
	
	private static Date someMonday = new Date(0, 0, 0, 2, 11, 2020);

}
