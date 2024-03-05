package day01;

public class Task01Fibonacci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8

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
    }
}
