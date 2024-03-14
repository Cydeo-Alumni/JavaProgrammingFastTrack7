package day08.collections;

import java.util.*;

public class Ex10Collections {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("hello", "world", "Zebra", "94444", "Java", "$dollars"));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 12, 4, 2, 4, 2, 1, 4));

        System.out.println("max " + Collections.max(nums));
        System.out.println("min " + Collections.min(nums));

        System.out.println("#3: " + Collections.frequency(nums, 3));
        System.out.println("#4: " + Collections.frequency(nums, 4));

        Collections.sort(nums);
        System.out.println(nums);
        nums.sort(Collections.reverseOrder()); // Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        Comparator<Book> sortBooks = (b, b2) -> {
            if (b.publishYear < b2.publishYear) {
                return -1;
            } else if (b.publishYear > b2.publishYear) {
                return 1;
            } else {
                return 0;
            }
        };

        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Mindset", 2017),
                new Book("How to code", 1982),
                new Book("Java is cool", 1998),
                new Book("Secrets", 1929)
        ));

        System.out.println(books);
        books.sort(sortBooks); //Collections.sort(books, sortBooks);
        System.out.println(books);

    }
}

class Book {
    String title;
    int publishYear;

    public Book(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }
}