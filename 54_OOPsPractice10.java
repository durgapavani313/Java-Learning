/*
10. Library Management System
Challenge
Concepts: Classes, objects, encapsulation, constructors, object relationships

Requirements:
- Create a Book class with title, author, and availability status.
- Create a Library class to manage books.
- Allow books to be added to the library.
- Create a method to display all books.
- Create a method to borrow a book if it is available.
- Create a method to return a borrowed book.
- Prevent borrowing an unavailable book or returning a book that was not borrowed.
- Test your program with multiple books.
Goal: Build a small real-world application using OOP principles.
*/

class Book {
    private String title;
    private String author;
    private boolean available;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
        System.out.println();
    }

    public void borrowBook() {
        if(available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        if(!available) {
            available = true;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}

class Library {
    private Book b1;
    private Book b2;
    private Book b3;

    public void addBooks(Book book1, Book book2, Book book3) {
        b1 = book1;
        b2 = book2;
        b3 = book3;
    }

    public void displayAllBooks() {
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }

    public void borrowBook(String title) {
        if (b1.getTitle().equalsIgnoreCase(title)) {
            b1.borrowBook();
        } else if (b2.getTitle().equalsIgnoreCase(title)) {
            b2.borrowBook();
        } else if (b3.getTitle().equalsIgnoreCase(title)) {
            b3.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

     public void returnBook(String title) {
        if (b1.getTitle().equalsIgnoreCase(title)) {
            b1.returnBook();
        } else if (b2.getTitle().equalsIgnoreCase(title)) {
            b2.returnBook();
        } else if (b3.getTitle().equalsIgnoreCase(title)) {
            b3.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "James Gosling");
        Book book2 = new Book("Python", "Guido van Rossum");
        Book book3 = new Book("C Programming", "Dennis Ritchie");

        Library library = new Library();

        library.addBooks(book1, book2, book3);

        System.out.println("--- All Books ---");
        library.displayAllBooks();

        System.out.println("--- Borrowing Books ---");
        library.borrowBook("Java");
        library.borrowBook("Java");

        System.out.println("\n--- Returning Books ---");
        library.returnBook("Java");
        library.returnBook("Python");

        System.out.println("\n--- Final Book List ---");
        library.displayAllBooks();
    }
}
