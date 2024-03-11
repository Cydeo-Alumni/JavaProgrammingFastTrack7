package day05;

import java.util.Arrays;

public class Ex02ArrayIntro {
    public static void main(String[] args) {
        //creating array
        int[] nums1 = {53, 343, 55};
        int nums2[] = new int[5]; // 0 as default
        int[] nums3 = new int[]{23,55,11,99};

        String[] userNames = new String[10];
        userNames[0] = "WoodenSpoon";

        //default values
        //int -> 0 as default value
        System.out.println(Arrays.toString(nums2));
        //String/Other object types -> null is default value
        System.out.println(Arrays.toString(userNames));
        //numbers with decimals -> 0.0
        System.out.println(Arrays.toString(new double[4]));
        //booleans -> false
        System.out.println(Arrays.toString(new boolean[3]));

        //Workaround for resizing array
        int[] counts = new int[2];
        counts[0] = 100;
        counts[1] = 55;
        //counts[2] = 88;//ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(counts));

        counts = Arrays.copyOf(counts, counts.length + 5);
        System.out.println(Arrays.toString(counts));


    }
}
