package day04;

public class Ex02MethodOverloading {
    public static void main(String[] args) {
        searchByPrice(1000.55);
        search(1000.55);
        search("One bedroom");
    }

    public static void searchByType(String type) {
        System.out.println("searching by type = " + type);
    }

    public static void searchByPrice(double price) {
        System.out.println("searching by price = " + price);
    }

    public static void searchByZipcode(int zipCode) {
        System.out.println("searching by zipCode = " + zipCode);
    }

    public static void search(String type) {
        System.out.println("searching by type = " + type);
    }

    public static void search(double price) {
        System.out.println("searching by price = " + price);
    }

    public static int search(int zipCode) {
        System.out.println("searching by zipCode = " + zipCode);
        return 101;
    }

//    public static int search(int zip) {
//        System.out.println("searching by zipCode = " + zip);
//        return 100;
//    }





}
