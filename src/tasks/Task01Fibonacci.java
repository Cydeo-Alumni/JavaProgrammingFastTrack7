package tasks;

import java.util.Arrays;

public class Task01Fibonacci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8
        //first approach using variables and a for loop
        int first = 0;
        int second = 1;
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        for (int i = 0; i < 10; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            System.out.println(sum);
        }

        //Solution using an array.
        int count = 10;
        int[] fibNums = new int[count];//10 elements to store fib numbers
        fibNums[0] = 0;
        fibNums[1] = 1;

        //fibNums[2] = fibNums[0] + fibNums[1];
        for (int i = 2; i < count; i++) {
            fibNums[i] = fibNums[i - 2] + fibNums[i - 1];
        }
        System.out.println(Arrays.toString(fibNums));
        System.out.println("fib number at " + count + " is " + fibNums[count-1]);
    }
}












