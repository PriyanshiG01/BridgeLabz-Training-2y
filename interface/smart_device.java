package functional_interface;

public class smart_device {
	public static void main(String[] args) {
		smartdevice l=new light();
		smartdevice a=new AC();
		smartdevice t=new Tv();
			 
		l.turnon();
		a.turnon();
		t.turnon();
		System.out.println("turning off..");
		
		l.turnoff();
		a.turnoff();
		t.turnoff();
	}

}
interface smartdevice{
	void turnon();
	void turnoff();
}
class light implements smartdevice{
	public void turnon() {
		System.out.println("light turn on");
	}
	public void turnoff() {
		System.out.println("light turn off");
	}
}
class AC implements smartdevice{
	public void turnon() {
		System.out.println("AC turn on");
	}
	public void turnoff() {
		System.out.println("AC turn off");
	}
}
class Tv implements smartdevice{
	public void turnon() {
		System.out.println("Tv turn on");
	}
	public void turnoff() {
		System.out.println("Tv turn off");
	}
}