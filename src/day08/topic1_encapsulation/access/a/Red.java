package day08.topic1_encapsulation.access.a;

public class Red extends Color{
    public void paint() {
        System.out.println("paint red");
    }

    public void mixColors() {
        System.out.println("mixing colors");
    }

    public static void main(String[] args) {
        Red color = new Red(); // inherit in same package
        System.out.println(color.c); // access: a, b, & c
    }
}
