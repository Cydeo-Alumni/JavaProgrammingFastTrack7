package tasks;

public class Task03SwapNumbers {
    public static void main(String[] args) {
        //you have 2 int variables, swap values without using third variable
        int num1 = 10;
        int num2 = 3;
             //10     3
        num1 = num1 + num2; //13
            // 13      3
        num2 = num1 - num2; //10
             // 13     10
        num1 = num1 - num2; //3

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
