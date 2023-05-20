package garageSystem;

public class FirstCome extends ConfigurationInt {
	
	@Override
	public int chooseSlot(Vehicle passedVehicle, Slot slotArray[]) {
		
		int ChosenID= -1;
		for (int i=0 ; i<slotArray.length ; i+=1){
			if(slotArray[i].getSlotDepth() > passedVehicle.getVehicleDepth()
					&& !slotArray[i].isFull() && slotArray[i].getSlotWidth() > passedVehicle.getVehicleWidth()){
				
				ChosenID = i+1;
				return ChosenID;
			}
		}
		return ChosenID;
	}

}
