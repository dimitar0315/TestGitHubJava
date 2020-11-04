package gitHubJavaConnection;

public class Event {
	
	private Date date;
	private String event;
	
	
	public Date getDate() {
		return date;
	}
	
	
	public String getEvent() {
		return event;
	}
	
	
	public Event() {
		event = "";
		date = new Date();
	}
	
	
	public Event(Date _date, String _event) {
		if(_event != null && !_event.isEmpty()) {
			event = _event;
		}
		if(_date != null) {
			date = _date;
		}
	}
	
	public String toString() {
		return date.toString() + " " + event;
	}
	
	
}
