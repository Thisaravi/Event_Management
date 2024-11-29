package EventPlanner;

public class PendingEvents {

	private String peventname;
	private String pdate;
	private String venue;
	private String attendees;
	
	public PendingEvents(String peventname, String pdate, String venue, String attendees) {

		this.peventname = peventname;
		this.pdate = pdate;
		this.venue = venue;
		this.attendees = attendees;
	}

	public String getPeventname() {
		return peventname;
	}

	public String getPdate() {
		return pdate;
	}

	public String getVenue() {
		return venue;
	}

	public String getAttendees() {
		return attendees;
	}
	
}