package day06.class_object;

public class Book extends Object {
    //instance variables
    int length;
    String author;

    //static variable
    static String publisher;
    static int count;

    //instance block
    {
        System.out.println("Instance initializer block");
    }
    //static block
    static {
        System.out.println("static initializer block");
    }

    //no-args constructor
    public Book() {
//        length = 100;
//        author = "unknown";
        this(100, "unknown");
        System.out.println("Creating a book object");
    }

    public Book(int length, String author) {
        this.length = length;
        this.author = author;
    }

    //instance method
    public void read() {
        System.out.println("Reading book by = " + author);
    }

    public static void addBooks(int count) {
        Book.count += count;
    }

}
