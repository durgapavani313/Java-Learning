/*
5. Mobile Phone
Easy–Intermediate
Concepts: Encapsulation, private fields, getters and setters
Requirements:
- Create a class named MobilePhone.
- Include brand, model, and price.
- Make the fields private.
- Provide getter methods to read the values.
- Provide setter methods where appropriate.
- Do not allow a negative price.
- Create an object and demonstrate accessing and updating its data through methods.
Goal: Learn how to protect an object's data.
*/


class MobilePhone {

    private String brand;
    private String model;
    private double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative");
        }
    }

    // Display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
}

class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S24", 65000);
        
        phone.displayDetails();

        phone.setModel("Galaxy S25");
        phone.setPrice(70000);

        System.out.println("\nAfter updating:");
        phone.displayDetails();

        phone.setPrice(-5000);

        System.out.println("\nAfter invalid price update:");
        phone.displayDetails();
    }
}

