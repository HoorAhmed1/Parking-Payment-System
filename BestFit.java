package garageSystem;

public class BestFit extends ConfigurationInt {

	@Override
	public int chooseSlot(Vehicle passedVehicle, Slot slotArray[]) {
		int i =0, ChosenID =-1;
		for (i=0; i<slotArray.length ; i+=1){
			if(slotArray[i].getSlotDepth() > passedVehicle.getVehicleDepth()
					&& !slotArray[i].isFull() && slotArray[i].getSlotWidth() > passedVehicle.getVehicleWidth()){
				ChosenID = i+1;
				break;
			}
		}
		if (ChosenID == -1){
			return -1;
		}
		for ( i=i ; i<slotArray.length ; i+=1){
			if((slotArray[i].getSlotDepth() > passedVehicle.getVehicleDepth()
				 && slotArray[i].getSlotWidth() > passedVehicle.getVehicleWidth())&& !slotArray[i].isFull()){
				//System.out.println(" in second loop ");
				if (slotArray[i].getSlotDepth() < slotArray[ChosenID-1].getSlotDepth()
						||slotArray[i].getSlotWidth() < slotArray[ChosenID-1].getSlotWidth() ){
					if ((slotArray[i].getSlotDepth()*slotArray[i].getSlotWidth())<
							(slotArray[ChosenID-1].getSlotWidth()*slotArray[ChosenID-1].getSlotDepth())){
						ChosenID = i+1;
					}
					
				}
				
			}
		}
		return ChosenID;
	}

}
