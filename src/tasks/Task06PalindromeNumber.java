package tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task06PalindromeNumber {
    public static void main(String[] args) {
        int num = 234432;

        //1) convert to string then compare. Goto PalindromeString solution
        //2) loop and assign to reverse numbers to another integer then compare
        //num % 10 will return last digit.
        //num / 10 will remove last digit

        int reversed = 0;
        int originalNum = num;

        while(num > 0) {
            //read last digit
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            //get rid of last digit
            num = num / 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + "  is palindrome");
        } else {
            System.out.println(originalNum + "  is Not palindrome");
        }
    }

    public static boolean isPalindromeNumber(int num) {
        int reversed = 0;
        int originalNum = num;

        while(num > 0) {
            //read last digit
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            //get rid of last digit
            num = num / 10;
        }
        return originalNum == reversed;
    }

    @Test
    public void verifyPalindromeNumberIsTrue() {
        int num = 1221;
        Assertions.assertEquals(Boolean.TRUE, isPalindromeNumber(num));
    }

    @Test
    public void verifyPalindromeNumberIsFalse() {
        int num = 4522;
        Assertions.assertEquals(Boolean.FALSE, isPalindromeNumber(num));
    }

}
