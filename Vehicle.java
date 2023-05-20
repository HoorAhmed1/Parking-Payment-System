package garageSystem;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.LocalTime;
public class Vehicle {
    //attributes
    private String customer_name;
    private String vehicleId;
    private double vehicleDepth;
    private double vehicleWidth;
    private String vehicleModel;
    private String modelYear;
    //private String vehicleID;
    public LocalTime startTime;
    public LocalTime endTime;
    private int parkedSlotID;
    //Methods
    //Constructors
    Vehicle(){
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter your name: ");
		String name = sc.nextLine();
    	System.out.println("Enter Car Model Name: ");
		String modelName = sc.nextLine();
		System.out.println("Enter Model Year: ");
		String model_year = sc.nextLine();
		System.out.println("Enter vehicle ID: ");
		String vehicleID = sc.nextLine();
		System.out.println("Enter vehicle width: ");
		double vehicle_Width = sc.nextDouble();
		System.out.println("Enter vehicle depth: ");
		double vehicle_Depth = sc.nextDouble();
		
		customer_name = name;
		vehicleId = vehicleID;
		vehicleDepth = vehicle_Depth;
		vehicleWidth = vehicle_Width;
		vehicleModel = modelName;
		modelYear = model_year;
			
    }
    Vehicle(String customer_name){
        this();
        this.customer_name=customer_name;
    }
    Vehicle(String customer_name,double depth,double width){
        this(customer_name);
        vehicleDepth=depth;
        vehicleWidth=width;
    }
    Vehicle(String customer_name,double length,double width,String carModel){
        this(customer_name,length,width);
        this.vehicleModel=carModel;
    }
    Vehicle(String modelName, String modelYear_, String vehicleID_ , double Width, double Depth){ 
    	
    	vehicleModel = modelName;
		vehicleId = vehicleID_;
    	modelYear = modelYear_;
    	vehicleDepth = Depth;
		vehicleWidth= Width;
		
    }
    Vehicle(String customer_name, double length, double width, String carModel, LocalTime arrivalTime, LocalTime departureTime){
        this(customer_name,length,width,carModel);
        this.startTime=arrivalTime;
        this.endTime=departureTime;
    }
    public String getVehicleId(){
        return vehicleId;
    }
    //setters and getters
    public void setWidth(double width){
        vehicleWidth=width;
    }
    public void setLength(double depth){
        vehicleDepth=depth;
    }
    public void setCustomer_name(String customer_name){
        this.customer_name=customer_name;
    }
    public void setCarModel(String vehicleModel){
        this.vehicleModel=vehicleModel;
    }
    public void setStartTime(LocalTime start){
		startTime = start;
	}
    public void setEndTime(LocalTime End){
		endTime = End;
	}
    public void setParkedSlotID(int id){
		parkedSlotID = id;
	}
    
    public int getParkedSlotID()
    {return parkedSlotID;}
    public double getVehicleDepth()
    {return vehicleDepth;}
    public double getVehicleWidth()
    {return vehicleWidth;}
    public String getCustomer_name()
    {return customer_name;}
    public String getVehicleModel()
    {return vehicleModel;}
    public LocalTime getStartTime()
    {return startTime;}
	
	public LocalTime getEndTime()
	{return endTime;}
	
	
	
    public int parkingTime(){
        return startTime.getHour()-endTime.getHour();
    }
    public double calculateFees(){
        return parkingTime()*5;
    }
    /*public static void main(String[] args) {
        Vehicle obj=new Vehicle();
        obj.setStartTime(LocalTime.now());
        obj.setEndTime(LocalTime.of(5,6));
        System.out.println(obj.parkingTime());
        System.out.println(obj.calculateFees());
    }*/
}
