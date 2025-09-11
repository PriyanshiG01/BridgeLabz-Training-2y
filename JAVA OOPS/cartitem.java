package java_method;
	import java.util.ArrayList;

	class CartItem {
	    String itemName;
	    double price;
	    int quantity;

	    CartItem(String itemName, double price, int quantity) {
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public double getTotalCost() {
	        return price * quantity;
	    }
	}

	class ShoppingCart {
	    ArrayList<CartItem> cart = new ArrayList<>();

	    public void addItem(CartItem item) {
	        cart.add(item);
	        System.out.println(item.itemName + " added to the cart.");
	    }

	    public void removeItem(String itemName) {
	        boolean removed = cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
	        if (removed) {
	            System.out.println(itemName + " removed from the cart.");
	        } else {
	            System.out.println(itemName + " not found in the cart.");
	        }
	    }

	    public void displayTotalCost() {
	        double total = 0;
	        for (CartItem item : cart) {
	            total += item.getTotalCost();
	        }
	        System.out.println("Total cost: ₹" + total);
	    }

	    public static void main(String[] args) {
	        ShoppingCart myCart = new ShoppingCart();

	        myCart.addItem(new CartItem("Laptop", 50000, 1));
	        myCart.addItem(new CartItem("Mouse", 500, 2));

	        myCart.displayTotalCost();

	        myCart.removeItem("Mouse");

	        myCart.displayTotalCost();
	    }
	}