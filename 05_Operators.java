class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        //1. Arithmetic Operators

        System.out.println("========== Arithmetic Operators ==========");

        System.out.println("Addition = "+(a + b));
        System.out.println("Subtraction = "+(a - b));
        System.out.println("Multiplication = "+(a * b));
        System.out.println("Division = "+(a / b));
        System.out.println("Modulo Division = "+(a %b));
        System.out.println();
        //2. Unary Operators

        System.out.println("========== Unary Operators ==========");

        int x = 5;
        System.out.println("Unary + = "+ (+x));
        System.out.println("Unary - = "+ (-x));
        System.out.println("Increment = "+ (++x));
        System.out.println("Decrement = "+ (--x));
        System.out.println();
        //3. Assignment Operators

        System.out.println("========== Assignment Operators ==========");
        
        int c = 15;
        c += 5;
        System.out.println("c += 5 : "+ c);
        c -= 3;
        System.out.println("c -= 3 : "+ c);
        c *= 2;
        System.out.println("c *= 2 : "+ c);
        c /= 5;
        System.out.println("c /= 5 : "+ c);
        c %= 2;
        System.out.println("c %= 2 : "+ c);

        //4. Relational Operators

        System.out.println("========== Relational Operators ==========");

        System.out.println("a == b : "+ (a == b));
        System.out.println("a != b : "+ (a != b));
        System.out.println("a > b : "+ (a > b));
        System.out.println("a < b : "+ (a < b));
        System.out.println("a >= b : "+ (a >= b));
        System.out.println("a <= b : "+ (a <= b));
        System.out.println();

        //5. Logical Operators

        System.out.println("========== Logical Operators ==========");

        boolean p = true;
        boolean q = false;
        System.out.println("p && q :"+(p && q));
        System.out.println("p || q :"+(p || q));
        System.out.println("!p :"+(!p));
        System.out.println();

        //6.Bitwise Operators

        System.out.println("========== Bitwise Operators ==========");

        int m = 5;
        int n = 3;
        System.out.println("m & n = "+ (m & n));
        System.out.println("m | n = "+ (m | n));
        System.out.println("m ^ n = "+ (m ^ n));
        System.out.println("~m = "+ (~m));
        System.out.println();

        //7. Shift Operators

        System.out.println("========== Shift Operators ==========");


        System.out.println("m << 1 ="+(m << 1));
        System.out.println("m >> 1 ="+(m >> 1));
        System.out.println("m >>> 1 ="+(m >>> 1));
        System.out.println();

        //8. Ternary Operator

        System.out.println("========== Ternary Operators ==========");

        int greater = (a > b) ? a : b ;
        System.out.println("Greater = "+greater);
    }
}
