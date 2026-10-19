/*
7. Animal Sounds
Intermediate
Concepts: Inheritance, method overriding

Requirements:
- Create a parent class named Animal.
- Add a method makeSound().
- Create child classes Dog, Cat, and Cow.
- Override makeSound() in each child class.
- Create objects of all three child classes and call their methods.
Goal: Understand how child classes inherit and customize behavior.
*/
class Animal {
    public void  makeSound() {
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    } 
}
class Cow extends Animal {
    public void makeSound() {
        System.out.println("Cow moos");
    }
}
class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Cow c2 = new Cow();

        d1.makeSound();
        c1.makeSound();
        c2.makeSound();  
    }
}

