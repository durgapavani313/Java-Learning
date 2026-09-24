import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your text: ");
        String input = sc.nextLine();
        StringBuilder text = new StringBuilder(input);
        System.out.println("\nOriginal text: " + text);

        //1.append()
        text.append(" Java");
        System.out.println("After append(): " +text);

        //2.insert()
        text.insert(0, "Hello ");
        System.out.println("After insert(): " +text);

        //3.replace()
        text.replace(0, 5, "Hi");
        System.out.println("After replace(): " +text);

        //4.delete
        text.delete(0, 3);
        System.out.println("After delete(): " +text);
    }
}
    

