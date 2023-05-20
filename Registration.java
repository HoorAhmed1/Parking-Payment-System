package garageSystem;
import java.util.Scanner;

public class Registration {
	String Username;
	String Password;
	
	//Authentication(){
	//}
	
	public void Authenticate(){
		Scanner sc=new Scanner(System.in);
		System.out.println("--Authentication--");
		String OwnerUserName, OwnerPassWord;
		System.out.println("Assign Admin UserName");
		OwnerUserName = sc.nextLine();
		System.out.println("Assign Admin UserPassword");
		OwnerPassWord = sc.nextLine();
		Username = OwnerUserName;
		Password = OwnerPassWord;
		
	}
	public void setSlotDimensions(Slot slotArray[]){
		//Garage obj= new Garage(slotArray.length;
		for (int i=0 ; i<slotArray.length; i+=1)
		{
			slotArray[i].setSlotID(i+1);
			System.out.println("Enter the width of Slot " + (i+1) + ": ");
			Scanner sc=new Scanner(System.in);
			double width=sc.nextDouble();
			slotArray[i].setSlotWidth(width);
			System.out.println("Enter the depth of Slot " + (i+1) + ": ");
			double depth=sc.nextDouble();
			slotArray[i].setSlotDepth(depth);
			slotArray[i].markEmpty();
		}
	}
	public int getSlotCount(){
		Scanner sc=new Scanner(System.in);
		System.out.println("--slot count--");
		System.out.println("Enter the number of slots: ");
		return (sc.nextInt());
	}
	public String setConfiguration(){
		Scanner sc=new Scanner(System.in);
		System.out.println("--Configuration Method--");
		System.out.println("Choose 1 -> First Come ");
		System.out.println("Choose 2 -> Best Fit ");
		int method = (sc.nextInt());
		while (method != 1 && method != 2){
			System.out.println("Please enter 1 or 2 ");
			method = (sc.nextInt());
		}
		if (method == 1){
			return ("FirstCome");	
		}
		if (method == 2){
			return ("BestFit");
		}
		return ("invalid");
		
	}
	
	
}