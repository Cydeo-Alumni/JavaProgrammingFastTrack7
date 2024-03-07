package day04;

import java.util.Arrays;

public class Ex03PassByValue {
    public static void main(String[] args) {
        //primitive copied by value
        int num = 55;
        System.out.println("n before method call = " + num);
        add5(num);//assign/copy/pass value 55 to method param
        System.out.println("n after method call = " + num);//55


        //array is an object, so reference is copied
        int[] nums = {10, 20, 30};
        System.out.println("Before = " + Arrays.toString(nums));
        doubleArrayValue(nums);//copy reference to same array object
        System.out.println("After = " + Arrays.toString(nums));

    }

    public static void doubleArrayValue(int[] nums) {
        nums = new int[]{40, 11, 4};//reassign to new array
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] *= 2;
//        }
        System.out.println("Nums array in method = " + Arrays.toString(nums));
    }

    public static void add5(int num) {
        num += 5;
        System.out.println("num in method = " + num);
    }
}
