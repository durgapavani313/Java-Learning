/*
4. Car Information
Beginner
Concepts: Classes, objects, methods, multiple behaviors
Requirements:
- Create a class named Car.
- Include brand, model, and speed.
- Create methods start(), accelerate(int amount), and brake(int amount).
- Speed must never become negative.
- Create two cars and demonstrate that their speeds can change independently.
Goal: Understand how each object maintains its own state.
*/

class Car {
    String brand;
    String model;
    int speed;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }
    public void start() {
        System.out.println(brand + " " + model + " started.");
    }
    public void accelerate(int amount) {
        if(amount < 0) {
            System.out.println("Accelerated amount cannot be negative.");
            return;
        }
        speed = speed + amount;
        System.out.println(brand + " speed = " + speed);
    }
    public void brake(int amount) {
        if(amount < 0) {
            System.out.println("Braking amount cannot be negative.");
            return;
        }
        if(amount >= speed) {
            speed = 0;
        } else {
            speed = speed - amount;
        }
        System.out.println(brand + " speed = " + speed);
    }
} 
class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Camry");
        Car c2 = new Car("BMW", "X5");

        c1.start();
        c2.start();

        c1.accelerate(20);
        c2.accelerate(50);

        c1.brake(5);
        c2.brake(10);

        System.out.println("Final speed of " + c1.brand +": " + c1.speed);
        System.out.println("Final speed of " + c2.brand +": " + c2.speed);
    }
}

