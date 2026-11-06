import java.util.Scanner; 

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        Integer obj = a;

        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + obj);

        sc.close();
    }
}

/* Output: 
Enter a number: 30
Primitive value: 30
Wrapper object: 30 */