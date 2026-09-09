class Main {
    public static void main(String[] args) {

        //break statement
        System.out.println("break statement");
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
        System.out.println(i);         
        }

        //continue statement
        System.out.println("continue statement");
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue;
            }
        System.out.println(i);         
        }

        //return statement
        System.out.println("Program completed");
        return;
    }
}
