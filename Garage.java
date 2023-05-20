package garageSystem;
import java.util.Scanner;


import java.time.*; 
import java.util.ArrayList;

public class Garage implements GarageInterface{
	
	public Slot[] slotArray;
	private int slotCount;
	private String Configuration;
	private boolean gate;
	private int vehicleCount=0;
	private static int totalIncome=0;
	//public Vehicle[] vehiclesList;
	Registration AuthenObject;
	//private Authentication AuthenObject;
	
	public Garage(int count){
		slotCount = count;
	}
	
	public Garage(){
		AuthenObject = new Registration();
		AuthenObject.Authenticate();
		slotCount = AuthenObject.getSlotCount();
		slotArray = new Slot[slotCount];
		for (int i=0; i<slotCount ; i+=1){
			slotArray[i] = new Slot();
		} 
		AuthenObject.setSlotDimensions(slotArray);
		//slotArray = temp.slotArray;
		Configuration = AuthenObject.setConfiguration();
		
	}
	public Slot getSlot(int i)
	{
		return slotArray[i];
	}
	
	public int getSlotCount(){
		return slotCount;
	}
	public void SetConfiguration (String config){
		Configuration = config;
	}
	
	public void setSlotCount(int count){
		slotCount = count;
	}
	public String getConfiguration(){
		return Configuration;
	}
	public int getVehicleCount(){
		return vehicleCount;
	}
	public int getTotalIncome(){
		return totalIncome;
	}
	public void setTotalIncome(int fees){
		totalIncome += fees;
	}
	public void incrementVehiclesCount(){
		vehicleCount += 1;
	}
	public void decrementVehiclesCount(){
		vehicleCount -= 1;
	}

}
