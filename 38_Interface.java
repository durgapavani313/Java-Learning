interface MyInterface {
    void myMethod();
}

class Child implements MyInterface {

    public void myMethod() {
        System.out.println("This is in myMethod");
    }
}

class Main {
    public static void main(String[] args) {

        Child c = new Child();

        c.myMethod();
    }
}