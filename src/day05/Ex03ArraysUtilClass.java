package day05;

import java.util.*; //import all classes from this package
import static java.util.Arrays.*;//import all static methods and variables

public class Ex03ArraysUtilClass {
    public static void main(String[] args) {
        int[] nums = {33,22,44};
        sort(nums);
        System.out.println(Arrays.toString(nums));

        //check if arrays are equal
        int[] arr1 = {4,3,1,2};
        int[] arr2 = {3,4,1,2};
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        //search index of value in an array
        char[] letters = {'d', 'q', '@', 'g','p'};
        int index = Arrays.binarySearch(letters, '@');
        System.out.println("index = " + index);
    }
}
