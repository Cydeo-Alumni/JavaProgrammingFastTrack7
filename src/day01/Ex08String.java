package day01;

public class Ex08String {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        if (a == b) {
            System.out.println("a and b are equal");
        }

        a = new String("python");
        b = new String("python");

        if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are Not equal");
        }
        //equals method. compare characters one by one
        if (a.equals(b) || a.equalsIgnoreCase(b)) {
            System.out.println("a and b are now equal");
        }

        System.out.println("-------------------");
        //concatenation operator +
        System.out.println(a + 23 + true);

        a += ", ruby";
        System.out.println("a = " + a);

        System.out.println("---------------");
        //StringBuilder and StringBuffer are mutable, we can change values of same object
        StringBuilder stb = new StringBuilder("apples");
        stb.append(" bananas");
        System.out.println("stb = " + stb);
        //thread safe. uses Syncronized keyword with all methods.
        StringBuffer stbf = new StringBuffer("java");
        stbf.append(" C++");
        System.out.println("stbf = " + stbf);
    }
}
