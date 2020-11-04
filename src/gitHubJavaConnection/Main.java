package gitHubJavaConnection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		d.year = 2000;
		d.month = 2;
		d.day = 20;
		d.hour = 16;
		d.minutes = 14;
		d.seconds = 30;
		
		
		
		Date d1 = new Date();
		d1.year = 2000;
		d1.month = 11;
		d1.day = 20;
		d1.hour = 16;
		d1.minutes = 14;
		d1.seconds = 30;
		
		
		System.out.print(d.compareToYear(d1));
		
		System.out.println(d.leapYear());
		
		System.out.println(d.currentDay());
		
		System.out.println(d.currentWeek());
		
		

	}
	
	
	

}
