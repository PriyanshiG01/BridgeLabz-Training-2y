package java_method;
	class MovieTicket {
	    String movieName;
	    int seatNumber;
	    double price;

	    public void bookTicket(String movieName, int seatNumber, double price) {
	        this.movieName = movieName;
	        this.seatNumber = seatNumber;
	        this.price = price;
	        System.out.println("Ticket booked successfully!");
	    }

	    public void displayTicketDetails() {
	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Seat Number: " + seatNumber);
	        System.out.println("Ticket Price: " + price);
	    }

	    public static void main(String[] args) {
	        MovieTicket ticket = new MovieTicket();
	        ticket.bookTicket("Oppenheimer", 12, 350.0);
	        ticket.displayTicketDetails();
	    }
	}
