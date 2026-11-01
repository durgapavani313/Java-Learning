import java.util.Scanner;

class Car {
    String carName;

    class Engine {
        void display() {
            System.out.println("Car Name: " + carName);
            System.out.println("Engine is running.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.print("Enter car name: ");
        c.carName = sc.nextLine();

        Car.Engine e = c.new Engine();

        System.out.println("\n--- Car Details ---");
        e.display();

        sc.close();
    }
}

/* Output:
Enter car name: BMW

--- Car Details ---
Car Name: BMW
Engine is running. */
 