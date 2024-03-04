package day01;

public class Ex05Operators {
    public static void main(String[] args) {
        //arithmetic
        int sum = 123 + 44;
        System.out.println("sum = " + sum);
        //shorthand
        sum+=10;
        System.out.println("sum = " + sum);
        //increment/decrement
        sum++; //add 1
        ++sum; // add 1
        System.out.println("sum = " + sum);

        System.out.println("sum = " + sum++);//post increment
        System.out.println("sum after sum++ = " + sum);

        System.out.println("++sum = " + ++sum);//pre increment

        //comparison operators and logical
        System.out.println("sum > 100 = " + (sum > 100));
        //range check
        System.out.println("sum > 100 && sum < 500 " + (sum > 100 && sum < 500));

        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false & true); //false

        System.out.println(true || true); //true
        System.out.println(true | false); //true
        System.out.println(false || true); //true
        System.out.println(false | true); //true
    }
}
