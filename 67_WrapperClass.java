import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        Integer obj = Integer.valueOf(a);

        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + obj);

        sc.close();
    }
}

/* Output:
Enter a number: 13
Primitive value: 13
Wrapper object: 13 */