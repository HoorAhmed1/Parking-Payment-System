package garageSystem;
import java.time.*;
import java.time.temporal.*;


public class Time {
	private LocalTime startTime;
    private LocalTime endTime;
     
    Time (){
    	
    }
    Time(LocalTime start, LocalTime end)
	{
		startTime = start;
		endTime = end;
	}
    public void setEndTime (Vehicle vehicle){
        vehicle.setEndTime(LocalTime.now());
    }
    
    public void setStartTime(Vehicle vehicle){
    	vehicle.setStartTime(LocalTime.now());
	}
    
    public LocalTime getStartTime()
    {return startTime;}
	
	public LocalTime getEndTime()
	{return endTime;}
	
	public int parkingTime(Vehicle vehicle){
		int start = vehicle.getStartTime().getHour();
		int end = vehicle.getEndTime().getHour();
		if (start-end==0)
			return 1;
        return (start-end);
    }

}
