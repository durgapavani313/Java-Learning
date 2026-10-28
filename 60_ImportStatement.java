import java.util.Scanner; 

class College {

    String name;

    void display() {

        System.out.println("College Name: " + name);
        System.out.println("Scanner is successfully imported.");

    }
}

class Main {

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        College c1 = new College();

        System.out.print("Enter college name: ");
        c1.name = sc.nextLine();

        c1.display();
    }
}
