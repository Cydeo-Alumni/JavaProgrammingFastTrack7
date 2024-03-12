package day06;

public class Ex04Recursion {
    public static void main(String[] args) {
        printNum(5);
        System.out.println("fibonacci = " + fib(30));
    }

    public static void printNum(int num) { //5
        System.out.println(num);
        if (num > 0) {
            printNum(num - 1);//4
        }
    }

    public static int fib(int n) {
        if(n < 2) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
