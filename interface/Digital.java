package functional_interface;

public class Digital {
    public static void main(String[] args) {
        digitalSystem u = new upi();
        digitalSystem c = new creditcard();
        digitalSystem w = new wallet();

        u.pay();
        c.pay();
        w.pay();
    }
}

interface digitalSystem {
    void pay();
}

class upi implements digitalSystem {
    public void pay() {
        System.out.println("pay by upi");
    }
}

class creditcard implements digitalSystem {
    public void pay() {
        System.out.println("pay by credit card");
    }
}

class wallet implements digitalSystem {
    public void pay() {
        System.out.println("pay by wallet");
    }
}
