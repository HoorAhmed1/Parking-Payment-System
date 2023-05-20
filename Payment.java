package garageSystem;

public class Payment {
	public int calculateFees(Vehicle vehicle){
        Time t = new Time();
        return t.parkingTime(vehicle)*5;
    }
	public void addtoFees(int fees, Garage garage){
		int total = garage.getTotalIncome() + fees;
		garage.setTotalIncome(total);
	}

}
