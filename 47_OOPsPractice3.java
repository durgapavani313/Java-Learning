/*
3. Book Information
Beginner
Concepts: Classes, objects, constructors
Requirements:
- Create a class named Book.
- Include title, author, and price.
- Create a constructor that initializes all three fields.
- Create a method displayBookInfo() to display the information.
- Create three different Book objects using the constructor.
Goal: Understand how constructors initialize objects.
*/

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + this.title + " | Author: " + this.author + " | Price: " + this.price);
    } 
}
class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 299);
        Book b2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam" ,250);
        Book b3 = new Book("The Guide", "R. K. Narayan", 199);

        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();
    }
}