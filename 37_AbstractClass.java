abstract class Animal {

    abstract void makeSound(); 
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {

        System.out.println("Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
        dog.sleep();
    }
}
