package functional_interface;

public class vehicle2 {
public static void main() {
	Rent c=() ->System.out.println("car has been rented");
	Rent B=() ->System.out.println("bikes has been rented");
	Rent b=() ->System.out.println("buses has been rented");
	
	ReturnVehicle C=() ->System.out.println("car has been returned");
	ReturnVehicle rB=() ->System.out.println("bikes has been returned");
	ReturnVehicle rb=() ->System.out.println("buses has been returned");
	
	c.rent();
	B.rent();
	b.rent();
	System.out.println("returning vehicles...");
	C.returnvehicle();
	rB.returnvehicle();
	rb.returnvehicle();
}
}
interface Rent{
	void rent();
}
interface ReturnVehicle{
	void returnvehicle();
}