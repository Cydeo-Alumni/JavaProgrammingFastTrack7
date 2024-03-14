package day08.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02SetObjects {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(); // random order
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println(set1);

        System.out.println("------------------------------------");

        Set<String> set2 = new LinkedHashSet<>(); // maintains insertion order
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println(set2);

        System.out.println("------------------------------------");

        Set<String> set3 = new TreeSet<>(); // maintains natural order (sorted) -> String types: lexicographically (ascii order)
        // Q: How does it handle when they are the same first character? It compares the 2nd and 3rd, and so on until it can determine which goes first
        // set3.add(null); // null is not allowed in TreeSet
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println(set3);

//        set3.get(0); no indexes in Set type so no get method

    }
}
