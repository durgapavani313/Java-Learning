class Parent {
    void display() {
        System.out.println("Display from parent");
    }
} 
class Child extends Parent {

    @Override 
    void display() {
        System.out.println("Display from child");
    }
}
class Main {
    public static void main(String[] args) {
        Child child = new Child();
        
        child.display();
    }
}
