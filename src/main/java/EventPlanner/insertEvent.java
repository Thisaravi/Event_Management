package EventPlanner;

public class insertEvent {
	private String eventName;
	private String eventDate;
	private String startTime;
	private String endTime;
	private String eventLocation;
	private String eventDescription;
	private String eventOrganizer;
	private String eventAttendees;
	private String eventRegDate;
	
	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public insertEvent(String eventName, String eventDate, String StartTime, String endTime, String eventLocation,
			String eventDescription, String eventOrganizer, String eventAttendees, String eventRegDate) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.startTime = StartTime;
		this.endTime = endTime;
		this.eventLocation = eventLocation;
		this.eventDescription = eventDescription;
		this.eventOrganizer = eventOrganizer;
		this.eventAttendees = eventAttendees;
		this.eventRegDate = eventRegDate;
	}


	public String getEventDate() {
		return eventDate;
	}


	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public String getEventLocation() {
		return eventLocation;
	}


	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}


	public String getEventDescription() {
		return eventDescription;
	}


	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}


	public String getEventOrganizer() {
		return eventOrganizer;
	}


	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}


	public String getEventAttendees() {
		return eventAttendees;
	}


	public void setEventAttendees(String eventAttendees) {
		this.eventAttendees = eventAttendees;
	}


	public String getEventRegDate() {
		return eventRegDate;
	}


	public void setEventRegDate(String eventRegDate) {
		this.eventRegDate = eventRegDate;
	}


}
