package garageSystem;

public class Slot {
	private double slotWidth;
	private double slotDepth;
	private int slotID;
	private boolean full;
	private boolean empty;
	public Vehicle parkedVehicle;
	
	public void setSlotWidth(double passedWidth){
		slotWidth = passedWidth;
	}
	public void setSlotDepth(double passedDepth){
		slotDepth = passedDepth;
	}
	public double getSlotWidth(){
		return slotWidth;
	}
	
	public double getSlotDepth(){
		return slotDepth;
	}
	public void setSlotID(int id){
		slotID = id; 
	}
	public int getSlotID (){
		return slotID;
	}
	
	public boolean isFull(){
		if (full==true)
			return true;
		else return false;
	}

	public void markFull (){
		full = true;
		empty = false;
	}
	public void markEmpty (){
		full = false;
		empty = true;
	}
	public void setParkedVehicle(Vehicle vehicle)
	{
		parkedVehicle = vehicle;
	}
}
