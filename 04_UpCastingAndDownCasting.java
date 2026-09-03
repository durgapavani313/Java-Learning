class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Main {
    public static void main(String[] args) {
        
        //Upcasting
        Dog d1 = new Dog();
        Animal a1 = d1;
        a1.eat();

        //Downcasting
        Animal a2 = new Dog();
        Dog d2 = (Dog)a2;
        d2.bark();
    }
}