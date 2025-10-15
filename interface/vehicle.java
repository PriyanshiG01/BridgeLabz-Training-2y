package functional_interface;

public class vehicle {
public static void main(String[] args) {
	vehicleSystem c=new car();
	vehicleSystem B=new bikes();
	vehicleSystem b=new bus();
	
	c.rent();
	B.rent();
	b.rent();
	System.out.println("returning vehicles..");
	c.returnVehicle();
	B.returnVehicle();
	b.returnVehicle();
}
}
interface vehicleSystem{
	void rent();
	void returnVehicle();
}
class car implements vehicleSystem{
	public void rent() {
		System.out.println("car has been rented");
	}
	public void returnVehicle() {
		System.out.println("car has been returned");
	}
}
class bikes implements vehicleSystem{
	public void rent() {
		System.out.println("bikes has been rented");
	}
	public void returnVehicle() {
		System.out.println("bikes has been returned");
	}
}
class bus implements vehicleSystem{
	public void rent() {
		System.out.println("bus has been rented");
	}
	public void returnVehicle() {
		System.out.println("bus has been returned");
	}
}