package billing;

public class Bill {

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public void displayTotal(double total) {
        System.out.println("Total Bill: " + total);
    }
}
