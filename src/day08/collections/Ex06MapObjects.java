package day08.collections;

import java.util.*;

public class Ex06MapObjects {
    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();
        // adding to a map: put()
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 3000); // using put with a key that is already in the map, will update the value

        System.out.println(gradeScale);

        // readying from a map: get()
        System.out.println(gradeScale.get('B')); // goes to the key and returns that value
        System.out.println(gradeScale.get('b'));

        // removing from a map : remove()
        gradeScale.remove('Z');
        System.out.println(gradeScale);

        // contains in a map

        System.out.println(gradeScale.containsKey('C'));
        System.out.println(gradeScale.containsKey('c'));

        System.out.println(gradeScale.containsValue(100));
        System.out.println(gradeScale.containsValue(90));

        System.out.println("------------------------------------");

        Map<Integer, String> map1 = new HashMap<>(); // random order
        // keys are Integer
        // values are String

        // map1.add(); there is no add method
        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(7, "seven");
        map1.put(10, "ten");
        map1.put(-2, "negative 2");
        map1.put(5, "five");
        map1.put(null, "empty");
        System.out.println(map1);

        System.out.println("------------------------------------");

        Map<Integer, String> map2 = new LinkedHashMap<>(); // maintains insertion order
        map2.put(4, "four");
        map2.put(1, "one");
        map2.put(7, "seven");
        map2.put(10, "ten");
        map2.put(-2, "negative 2");
        map2.put(5, "five");
        map2.put(null, "empty");
        System.out.println(map2);

        System.out.println("------------------------------------");

        Map<Integer, String> map3 = new TreeMap<>(); // maintains natural order for the keys
        map3.put(4, "four");
        map3.put(1, "one");
        map3.put(7, "seven");
        map3.put(10, "ten");
        map3.put(-2, "negative 2");
        map3.put(5, "five");
//        map3.put(null, "empty"); null not allowed in TreeMap
        System.out.println(map3);

        System.out.println("------------------------------------");

        Map<Integer, String> map4 = new Hashtable<>(); // random order
        map4.put(4, "four");
        map4.put(1, "one");
        map4.put(7, "seven");
        map4.put(10, "ten");
        map4.put(-2, "negative 2");
        map4.put(5, "five");
//        map4.put(null, "empty"); null key not allowed
//        map4.put(9, null); null values not allowed
        System.out.println(map4);

    }
}
