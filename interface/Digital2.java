package functional_interface;

public class Digital2 {
public static void main(String[] args) {
	digital upi =()->System.out.println("pay by upi");
	digital creditcard =()->System.out.println("pay by credit card");
	digital wallet =()->System.out.println("pay by wallet");
	
	upi.pay();
	creditcard.pay();
	wallet.pay();
	
}
}
interface digital{
	void pay();
	}
