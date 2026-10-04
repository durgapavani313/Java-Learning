class Parent {

    int x = 10;

    Parent() {
        System.out.println("Parent constructor");
    }
    void display() {
        System.out.println("Parent class method");
    }    
}

class Child extends Parent {

    int x = 20;

    Child() {
        super();

        System.out.println("Child constructor");
    }    
    void show() {
        System.out.println("Child x = " +x);

        System.out.println("Parent x = " +super.x);

        super.display(); 
    }
}
class Main{

    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();
    }
}

