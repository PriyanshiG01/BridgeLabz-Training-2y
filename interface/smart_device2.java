package functional_interface;

public class smart_device2 {
	public static void main(String[] args) {
		turnon light=() -> System.out.println("lights turn on");
		turnoff Light=() -> System.out.println("lights turn off");
		
		turnon ac=() -> System.out.println("Ac turn on");
		turnoff Ac=() -> System.out.println("Ac turn off");
		
		turnon tv=() -> System.out.println("Tv turn on");
		turnoff Tv=() -> System.out.println("Tv turn off");
		
		light.turnon();
		ac.turnon();
		tv.turnon();
		System.out.println("turning off ..");
		Light.turnoff();
		Ac.turnoff();
		Tv.turnoff();
	}
}
interface turnon{
	void turnon();
}
interface turnoff{
	void turnoff();
}
