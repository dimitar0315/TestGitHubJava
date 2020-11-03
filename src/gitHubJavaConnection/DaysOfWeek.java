package gitHubJavaConnection;

public enum DaysOfWeek {
	
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private final int dayIdx;
	
	DaysOfWeek(int idx) {
		dayIdx = idx;
	}
	public int getIndex() {
		return dayIdx;
	}
	public String toString() {
		switch(dayIdx) {
		case 1: return "Понеделник";
		case 2: return "Вторник";
		case 3: return "Сряда";
		case 4: return "Четвъртък";
		case 5: return "Петък";
		case 6: return "Събота";
		case 7: return "Неделя";
		default: return null;
		}
	}
	public String toString(int len) {
		String s = toString();
		return len < s.length() ? s.substring(0, len) : s;
	}
	
	public static DaysOfWeek getDay(int dayIndex) {
		switch((dayIndex-1)%7+1) {
		case 1: return MONDAY;
		case 2: return TUESDAY;
		case 3: return WEDNESDAY;
		case 4: return THURSDAY;
		case 5: return FRIDAY;
		case 6: return SATURDAY;
		case 7: return SUNDAY;
		default: return null;
		
		}
	}
	
	
}



