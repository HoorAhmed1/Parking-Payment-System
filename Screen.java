package garageSystem;

import java.util.Scanner;

public class Screen {

	public void displayAvailableSlots(Garage ob)
	{
		for (int i=0;i<ob.getSlotCount();i++)
		{
			if (ob.getSlot(i).isFull()==false)
				System.out.println("slot ("+(i+1)+")is available ");
		}
		if (ob.getVehicleCount() == ob.getSlotCount()){
			System.out.println("Full Garage ");
		}
	}
	public void displayNoSlot()
	{
		System.out.println("No Suitable Slots");
	
	}
	public void displayChosenSlot(Slot chosen)
	{
		System.out.println("Park in Slot " + chosen.getSlotID() + "-> width:" + chosen.getSlotWidth() + " length: " + chosen.getSlotDepth());
	}
	
	public void displayFees(double fees)
	{
		System.out.println("Please pay " + fees +  " pounds. " );
	}
	public String getVehicleID(){
		System.out.println("Enter your vehicle ID: " );
		Scanner sc=new Scanner(System.in);
		String ID =sc.nextLine();
		return ID;
	}
	public int chooseOption(){
		System.out.println("Choose an option: " );
		System.out.println("1- Park in " );
		System.out.println("2- Park out " );
		System.out.println("3- Display all available slots " );
		System.out.println("4- Admin " );
		Scanner sc=new Scanner(System.in);
		int Choice =sc.nextInt();
		return Choice;
		
	}
	public int chooseAdminOptions(){
		System.out.println("Admin Options: " );
		System.out.println("1- View total vehicles" );
		System.out.println("2- View total income" );
		System.out.println("3- Display all available slots " );
		//System.out.println("4- Admin " );
		Scanner sc=new Scanner(System.in);
		int Choice =sc.nextInt();
		return Choice;
	}
	public void printTotalIncome(Garage garage){
		System.out.println("Total Income: " + garage.getTotalIncome());
	}
	

}
