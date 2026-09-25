import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] characters = text.toCharArray();

        System.out.println("Characters are: ");
        
        for(int i = 0; i < characters.length; i++) {
            System.out.println("Index " +i +" : " + characters[i]);
        }
        sc.close(); 
    }
}
