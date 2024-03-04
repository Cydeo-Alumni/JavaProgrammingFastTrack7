package day01;

public class Ex03Casting {
    public static void main(String[] args) {
        byte n1 = 11;
        int n2 = n1; //cast from small to large automatically

        int n3 = 200;
        byte n4 = (byte)n3; //cast from large to small
        
        double n5 = n3;
        System.out.println("n5 = " + n5);

        //cast double to int and get rid of decimal points
        double n6 = 232454.55;
        int n7 = (int)n6;
        System.out.println("n6 = " + n6);
        System.out.println("n7 = " + n7);

        int n8 = 10, n9 = 3;
        System.out.println("n8 / n9 = " + n8 / n9); //3
        System.out.println("n8 / n9 = " + (double)n8 / n9); //3.333...
    }
}
