package garageSystem;

import java.util.ArrayList;


public class Exit {

	public void markSlotEmpty(Slot s){
        s.markEmpty();
    }
	
    public void parkOut(Garage garage ){
    	
    	int index=-1;
    	Screen screen = new Screen();
    	String vehicleID = screen.getVehicleID();
    	System.out.println("currently =" + garage.slotArray[0].parkedVehicle.getVehicleId()+".");
    	System.out.println("vehicle id =" + vehicleID +".");
    	System.out.println("vehicle count = " + garage.getVehicleCount());
    	for (int i=0 ; i<garage.slotArray.length; i+=1){
    		System.out.println("inside for loop");
    		if (garage.slotArray[i].isFull()){
    			System.out.println("inside first if");
    			if (garage.slotArray[i].parkedVehicle.getVehicleId().equals(vehicleID)){
        			System.out.println("vehicle id = " + vehicleID);
        			System.out.println("currently = " + garage.slotArray[i].parkedVehicle.getVehicleId());
        			index = i;
        		}
    		}
    		
    	}
    	
    	while (index == -1){
    		System.out.println("index == -1");
    		vehicleID = screen.getVehicleID();
        	for (int i=0 ; i<garage.slotArray.length; i+=1){
        		if (garage.slotArray[i].parkedVehicle.getVehicleId()==vehicleID){
        			index = i;
        		}
        	}
    	}
    	
    	Time t = new Time();
    	t.setEndTime(garage.slotArray[index].parkedVehicle);
        Payment paymentObj = new Payment();
        int fees = paymentObj.calculateFees(garage.slotArray[index].parkedVehicle);
        paymentObj.addtoFees(fees, garage);
        markSlotEmpty(garage.slotArray[index]);
        garage.slotArray[index].markEmpty();
        garage.decrementVehiclesCount();
        //Screen screen = new Screen();
        screen.displayFees(fees);
        
        
    }
    

}
