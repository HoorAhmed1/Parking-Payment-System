package garageSystem;
import java.util.Scanner;

public class SignIn extends Registration {
	SignIn(){
		super();
	}
	boolean signIn(Garage obj){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Admin UserName");
		String OwnerUserName = sc.nextLine();
		System.out.println("Enter Admin UserPassword");
		String OwnerPassword = sc.nextLine();
		if (obj.AuthenObject.Username.equals(OwnerUserName) && obj.AuthenObject.Password.equals(OwnerPassword))
			return true;
		else return false;
	}
}


