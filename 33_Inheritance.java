import java.util.Scanner;

class Animal {
    String name;
    void displayAnimal() {
        System.out.println("Animal name: " +name);
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println(name +" is barking");
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d = new Dog();
        System.out.print("Enter animal name: ");
        d.name = sc.nextLine();
        
        d.displayAnimal();
        d.bark();
    }
}
