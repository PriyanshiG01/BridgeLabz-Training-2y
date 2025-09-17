package priyanshi;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void calculateCost() {
        int costPerDay = 1000;
        int total = rentalDays * costPerDay;
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + total);
    }
}

public class CarRentalMain {
    public static void main(String[] args) {
        CarRental cr1 = new CarRental("Priyanshi", "Swift", 5);
        cr1.calculateCost();
    }
}
