package garageSystem;

public class userController {

	public static void main(String[] args) {
		
		Garage garageObject = new Garage();
		Screen screenObj = new Screen();
		Parking parkingObj = new Parking();
		Payment paymentObject = new Payment();
		Exit exitObj = new Exit();
		
		boolean x=true;
		int choice=0;
		while (x){
			choice = screenObj.chooseOption();
		
			while (choice >4 || choice<1){
				choice = screenObj.chooseOption();
			}
			if (choice==1){
				Vehicle vehicleObj = new Vehicle();
				int park = parkingObj.parkIn(garageObject.slotArray, vehicleObj, garageObject.getConfiguration(), garageObject);
				
			}
			if (choice == 2){
				exitObj.parkOut(garageObject);
			}
			if (choice == 3){
				screenObj.displayAvailableSlots(garageObject);
			}
			if (choice == 4){
				SignIn sign = new SignIn();
				boolean X= sign.signIn(garageObject);
				while (X == false ){
					X= sign.signIn(garageObject);
				}
				int newChoice = screenObj.chooseAdminOptions();
				if (newChoice == 1){
					System.out.println(garageObject.getVehicleCount());
				}
				if (newChoice == 2){
					screenObj.printTotalIncome(garageObject);
				}
				if (newChoice == 3){
					screenObj.displayAvailableSlots(garageObject);
				}
				
			}
		 

			
			}
		//garageObject.parkIn();
		//Screen screenObject= new Screen();
		//screenObject.displayAvailableSlots(garageObject);
	}

}
