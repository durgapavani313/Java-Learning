class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println(numbers[7]);
        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index!");  
        }
        
        System.out.println("Program continues...");
    }
}

/* Output: 
Invalid array index!
Program continues... */