package gitHubJavaConnection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		d.year = 2000;
		d.month = 2;
		d.day = 20;
		d.hour = 16;
		d.min = 14;
		d.sec = 30;
		
		
		Date d1 = new Date();
		d1.year = 2000;
		d1.month = 11;
		d1.day = 20;
		d1.hour = 16;
		d1.min = 14;
		d1.sec = 30;
		
		
		System.out.print(d.compareToYear(d1));
		
		System.out.print(d.wisokosna());
		
		System.out.println(d.curDay());

	}
	
	
	

}
