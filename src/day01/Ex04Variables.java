package day01;

public class Ex04Variables {
    int count = 10; //instance variable

    public static void main(String[] args) {
        //System.out.println(count); ERROR static cannot call nonstatic
        int n = 44;

        if (10 > 5) {
            int n2 = 123;
            System.out.println("n = " + n);

        }
       //System.out.println(n2); //error, not in scope

        System.out.println(new Ex04Variables().count);

        int i;
        for (i = 0; i < 10; i++) {
            System.out.print(i + ",");
        }
        System.out.println("\n"+i);//print i after loop. new line

    }
}
