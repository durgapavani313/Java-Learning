import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter animal name: ");
        String name = sc.nextLine();

        Animal a = new Animal() {
            @Override 
            void sound() {
                System.out.println(name + " makes a sound");
            }
        };

        a.sound();

        sc.close();
    }
}

/* Output:
Enter animal name: Dog
Dog makes a sound */