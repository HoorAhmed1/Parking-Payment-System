package garageSystem;

import java.util.ArrayList;

public class Parking {
	public int parkIn (Slot slotArray[], Vehicle passedVehicle, String config, Garage garage){
		int SlotID=-1;
	
		Screen screenObj = new Screen();
		//Vehicle vehicle = new Vehicle();
		if (checkNotFull(slotArray)){
			
			if (config=="FirstCome"){
				FirstCome firstcome = new FirstCome();
				SlotID = firstcome.chooseSlot(passedVehicle, slotArray);
				
			}
			if (config=="BestFit"){
				
				BestFit bestfit = new BestFit();
				SlotID = bestfit.chooseSlot(passedVehicle, slotArray);
				
			}
			if (SlotID >=1){
				slotArray[SlotID-1].markFull();
				passedVehicle.setParkedSlotID(SlotID-1);
				//vehicleArray[count] = passedVehicle;
				screenObj.displayChosenSlot(slotArray[SlotID-1]);
				Time t = new Time();
				t.setStartTime(passedVehicle);
				slotArray[SlotID-1].setParkedVehicle(passedVehicle);
				garage.incrementVehiclesCount();
				return SlotID;
			}
			
			if (SlotID == -1){
				screenObj.displayNoSlot();
				
				return -1;
			}
			
			
		}
		screenObj.displayNoSlot();
		return SlotID;
		
		
	}
	public boolean checkNotFull(Slot slotArray[]){
		int counter=0;
		for (int i=0 ; i<slotArray.length; i+=1){
			if (slotArray[i].isFull())
				{counter+=1;}
		}
		
		if (counter < slotArray.length)
		{return true;}
		else return false;
	}
}
