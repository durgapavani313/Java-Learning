class Animal {
    void eat() {

        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {

        System.out.println("Animal barks");
    }
}
class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();

        obj.eat();
        obj.bark();
    }
}