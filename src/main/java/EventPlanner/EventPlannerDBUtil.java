package EventPlanner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EventPlannerDBUtil {
	
	private static Connection con =null;
	private static Statement stmt =null;
	private static ResultSet rs = null;
	
	//validation of logging
	public static List<EventPlanner> validate(String userName, String password){
		
		ArrayList<EventPlanner> Eplanner = new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from eventplanner where userName ='"+userName+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String Uname = rs.getString(5);
				String passW = rs.getString(6);
				
				EventPlanner EP = new EventPlanner(id,name,email,phone,Uname,passW);
				Eplanner.add(EP);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return Eplanner;
	}
	
	//retrieve data from the database table  pending_events
	static List<PendingEvents> getAllData() {
        ArrayList<PendingEvents> details = new ArrayList<>();

        try {
            con = DBconnect.getConnection();
            stmt = con.createStatement();

            String sql = "SELECT * FROM pending_events";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String peventsname = rs.getString(1);
                String pdate = rs.getString(2);
                String venue = rs.getString(3);
                String attendees = rs.getString(4);

                PendingEvents pe = new PendingEvents(peventsname, pdate, venue, attendees);
                details.add(pe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return details;
    }
	
	//insert event details into the table
	public static boolean insertEdetails(String name,String Date,String StartTime,String EndTime,String Venue,String Description,String eOrganizer,String Attendees,String RegD) {
		boolean isSuccess = false;
		
		try {
			con = DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql =  "insert into event values ('"+name+"','"+Date+"','"+StartTime+"','"+EndTime+"','"+Venue+"','"+Description+"','"+eOrganizer+"','"+Attendees+"','"+RegD+"')";
			int rs = stmt.executeUpdate(sql);
		
			if(rs >0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static List<insertEvent> getEventDetails(){
		ArrayList<insertEvent> planned= new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM event";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String eventName = rs.getString(1);
				String eventDate = rs.getString(2);
				String StartTime = rs.getString(3);
				String endTime = rs.getString(4);
				String eventLocation = rs.getString(5);
				String eventDescription = rs.getString(6);
				String eventOrganizer = rs.getString(7);
				String eventAttendees = rs.getString(8);
				String eventRegDate = rs.getString(9);
				
				insertEvent eventP = new insertEvent(eventName, eventDate,StartTime, endTime, eventLocation, eventDescription,eventOrganizer, eventAttendees, eventRegDate);
				planned.add(eventP);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return planned;
	}
	
	public static insertEvent getSingleEventDetails(String eventName){
		ArrayList<insertEvent> planned= new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM event where eventName = '"+eventName+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			System.err.println(eventName);
			
			if(rs.next()) {
				
				String eventDate = rs.getString(2);
				String StartTime = rs.getString(3);
				String endTime = rs.getString(4);
				String eventLocation = rs.getString(5);
				String eventDescription = rs.getString(6);
				String eventOrganizer = rs.getString(7);
				String eventAttendees = rs.getString(8);
				String eventRegDate = rs.getString(9);
				System.err.println(endTime);
				
				insertEvent eventP = new insertEvent(eventName, eventDate,StartTime, endTime, eventLocation, eventDescription,eventOrganizer, eventAttendees, eventRegDate);
				return eventP;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean deleteEvent(String peventname) {
		
		boolean Success = false;

		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from pending_events where peventname = '" + peventname + "'";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				Success = true;
			}
			else {
				Success = false;
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return Success;
	
			
		}


	static boolean updateEventDetails(String eventName, String eventDate, String StartTime, String endTime, String eventLocation, String eventDescription, String eventOrganizer, String eventAttendees, String eventRegDate) {
    boolean success = false;
    
    try {
        con = DBconnect.getConnection();
        stmt = con.createStatement();

        String sql = "UPDATE event SET eventDate = '" + eventDate + "', StartTime = '" + StartTime + "', endTime = '" + endTime + "', eventLocation = '" + eventLocation + "', eventDescription = '" + eventDescription + "', eventOrganizer = '" + eventOrganizer + "',eventAttendees = '" + eventAttendees + "',eventRegDate = '" + eventRegDate + "' WHERE eventName = '"+eventName+"'";
        
        int rs = stmt.executeUpdate(sql);

        if (rs > 0) {
            success = true;
        } else {
            success = false;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return success;
	}
}
