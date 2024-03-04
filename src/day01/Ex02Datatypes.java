package day01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex02Datatypes {
    // var num = 10;  ERROR
    public static void main(String[] args) {
        //primitive types:
        //whole numbers | integers
        byte a = 10;
        short b = 12000;
        int c = 1234556;
        long d = 23423523423L;

        //decimal numbers:
        float e = 33.4F;
        double f = 1342342.32;

        //char
        char g = '#', p = 234;
        //boolean true or false
        boolean h = false;
        //var type, automatically detect data type
        var anyType = 56.8;
        var anyType2 = false;

        //Non primitives/object types
        String str = "hi";
        Scanner scanner;
        Object obj = new String("abc");

        //wrapper classes
        System.out.println("Max int = " + Integer.MAX_VALUE);
        System.out.println("Max long = " + Long.MAX_VALUE);
        System.out.println("Max double = " + Double.MAX_VALUE);

        //compare 2 numbers
        System.out.println("larger int = " + Integer.max(10, 5));
        System.out.println("sum of double = " + Double.sum(4343.2, 12.4));

        //convert from String to wrapper type:
        String strAge= "44";
        int age = Integer.parseInt(strAge);
        System.out.println("strAge = " + strAge);
        System.out.println("age = " + age);

       //Autoboxing -> converting from primitive to wrapper object
        Integer i = 11;

        //Unboxing -> converting from wrapper object to primitive
        int n = i;
        System.out.println("i = " + i);
        System.out.println("n = " + n);

        //BigInteger, BigDecimal
        BigInteger big = new BigInteger("134534632456345345345234342513451345");
        System.out.println(big.add(new BigInteger("3")));

    }
}
