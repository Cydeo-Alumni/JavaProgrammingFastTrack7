package day06;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03VarArgs {
    public static void main(String[] args) {
        readLetters('A','B','C'); //
        readLetters();
        readLetters('J','A','V','A');
        readLetters(new char[]{'h', 'e', 'l', 'l', 'o'});

        int[] myNums = {5,2,7};
        readNumbers(myNums);

    }
    //Vargs parameter is created using ...
    public static void readLetters(char... letters) {
        System.out.println(Arrays.toString(letters));
    }

    public static void readNumbers(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
