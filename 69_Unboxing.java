import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Integer obj = Integer.valueOf(num);

        int result = obj;

        System.out.println("Wrapper object: " + obj);
        System.out.println("Primitive value: " + result);

        sc.close();
    }
}

/* Output: 
Enter a number: 3
Wrapper object: 3
Primitive value: 3 */