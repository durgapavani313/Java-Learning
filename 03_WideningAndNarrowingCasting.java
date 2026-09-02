class Main{
    public static void main(String[] args){

        //Widening Casting
        int a = 10;
        double b = a;

        System.out.println("Widening: " +b);

        //Narrowing Casting
        double x = 15.75;
        int y = (int)x;
        System.out.println("Narrowing : " +y);
    }
}