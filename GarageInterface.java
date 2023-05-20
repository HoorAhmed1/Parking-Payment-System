package garageSystem;

public interface GarageInterface {
	
	public Slot getSlot(int i);
	
	public int getSlotCount();
	public void SetConfiguration (String config);
	
	public void setSlotCount(int count);
	public String getConfiguration();
	public int getVehicleCount();
	public int getTotalIncome();
	public void setTotalIncome(int fees);
	public void incrementVehiclesCount();
	public void decrementVehiclesCount();
}
