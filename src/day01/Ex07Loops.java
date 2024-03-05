package day01;

import java.util.Arrays;
import java.util.List;

public class Ex07Loops {
    public static void main(String[] args) {

        int day = 1;
        while(day < 6) {
            System.out.println(day + " - it is weekday, keep working");
            day++;
        }
        System.out.println(day + " - it is weekend, take day off");

        System.out.println("---------------------------------");
        do {
            System.out.println(day + " take a day off");
            day++;
        }while (day == 6 || day == 7);

        System.out.println("---------------------------------");

        for (int i = 0; i <= 5; i++) {
            System.out.println(i +" - Hello");
        }

        for (char letter = 'A'; letter <= 'Z'; letter++){
            if (letter == 'C' || letter == 'D') {
                continue; //skip rest of iteration. goto next iteration
            }
            System.out.print(letter + " ");
            if (letter == 'Q') {
                break; //exit loop
            }
        }

        System.out.println("-------------------");
        
        int num = 20;
        int[] nums = {30, 10, 44, 33, 1};
        for (int n : nums) {
            System.out.println("n = " + n);

            if (n % 2 == 0)
                System.out.println(n + " is even");
            else
                System.out.println(n + " is odd");

        }

        System.out.println("--------------------");
        //convert strings array to list then call for eachMethod(lambda)
        String[] strings = {"CR22", "UNI130", "GR44"};

        List<String> strList = Arrays.asList(strings);
        strList.forEach(s -> System.out.println("s = " + s));

        System.out.println("---------------------");
        //nested for loop, for each iteration of outer loop, inner loop will run completely
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Outer = " + i + " - Inner = " + j);
            }
            System.out.println("-----");
        }
    }
}
