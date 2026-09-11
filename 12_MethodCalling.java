class Main {
    
    static void method1() {
        
        System.out.println("This is a static method. (method1)");
    }

    void method2() {

        System.out.println("This is a non-static method. (method2)");
    }


    public static void main(String[] args) {

        System.out.println("Calling static method with class name: ");
        Main.method1();
        System.out.println();
        
        Main reference = new Main();

        System.out.println("Calling non-static method with class reference: ");
        reference.method2();
        System.out.println();

        System.out.println("Calling static method with class reference: ");
        reference.method1();
        System.out.println();
    }
}