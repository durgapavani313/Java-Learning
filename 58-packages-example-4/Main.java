import operations.Calculator;
import messages.Welcome;

public class Main {
    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        welcome.showMessage();

        Calculator calc = new Calculator();
        calc.add(10, 5);
        calc.subtract(10, 5);
    }
}