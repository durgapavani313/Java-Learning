import java.util.Scanner;
import products.Product;
import billing.Bill;
import store.Store;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Store store = new Store();
        store.displayWelcome();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

         System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product();
        Bill bill = new Bill();

        System.out.println("\n--- Product Details ---");
        product.displayProduct(name, price, quantity);

        double total = bill.calculateTotal(price, quantity);

        System.out.println("\n--- Bill Details ---");
        bill.displayTotal(total);

        sc.close();
    }
    
}