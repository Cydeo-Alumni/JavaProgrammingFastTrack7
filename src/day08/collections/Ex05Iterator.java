package day08.collections;

import java.util.*;

public class Ex05Iterator {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("James", "Anna", "Emre", "Jane"));

        // with the for each loop
        for (String each : names) {
            System.out.println(each);
            //names.remove(each); =>ConcurrentModificationException
        }
        System.out.println();

        System.out.println("------------------------------------\nIterator manually");

        // manually using iterator object and methods

        Iterator<String> it = names.iterator(); // pin is created, it starts before the first element

        System.out.println(it.hasNext()); // checks is there any element after (from where the pin currently is)
        System.out.println(it.next()); // moves the pin once and returns the value of that element (where the pin is)

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        //System.out.println(it.next()); exception occurs because there is no elements left

        System.out.println("------------------------------------\nIterator in while loop:");

        // dynamically using iterator with while loop
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------------\nIterator for removing Strings:");

        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "java", "hello", "world", "automation", "fan", "soft skills", "lunch"));

        Iterator<String> it2 = words.iterator();
        while (it2.hasNext()) {
            if (it2.next().length() <= 4) {
                it2.remove();
            }
        }

        System.out.println(words);
        System.out.println(new TreeSet<>(words));

        System.out.println("------------------------------------\nIterator for removing numbers:");

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 5, 2, 6, 8, 2, 5, -1, 19, 20, 23, 2, 13, 5, 3, 2));

        // Remove all numbers less than 5

        Iterator<Integer> it3 = nums.iterator();
        while (it3.hasNext()) {
            if (it3.next() < 5) {
                it3.remove();
            }
        }

        System.out.println(nums);

        System.out.println("------------------------------------\nMini Task");

        /*
            Given an ArrayList of names, remove all the names that are 'Ahmed'
        */

        List<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Anna", "Emre", "Jane", "Ahmed", "Andrew", "Ahmed", "Ahmed", "Elizabeth", "Merve"));

        Iterator<String> itNames = namesList.iterator();

        while(itNames.hasNext()){
            if(itNames.next().equals("Ahmed")){
                itNames.remove();
            }
        }

        namesList.removeIf(name -> name.equals("Jane"));

        System.out.println(namesList);

    }
}
