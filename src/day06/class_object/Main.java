package day06.class_object;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //create book objects
        Book book1 = new Book();
        Book book2 = new Book(200, "James");
        System.out.println(book1.equals(book2));

        //print instance variables
        System.out.println(book1.author);
        System.out.println(book1.length);

        System.out.println(book2.author);
        System.out.println(book2.length);

        //access static variable:
        Book.publisher = "Cydeo";

        System.out.println(Book.publisher);
        System.out.println(book1.publisher);
        System.out.println(book2.publisher);

        Book.addBooks(123);
        System.out.println(Book.count);
        System.out.println(book1.count);
        System.out.println(book2.count);

        Thread.sleep(3000);

        String str = "exception";
        System.out.println(str.charAt(5));

    }
}
