package day08.topic1_encapsulation.access.b;

import day08.topic1_encapsulation.access.a.Color;
import day08.topic1_encapsulation.access.a.Red;

public class Draw {
    public static void main(String[] args) {
        Color color = new Color(); // direct access, different package
        System.out.println(color.a); // access only a
        Color r = new Red();
        r.paint();
        Red red = (Red) r;
       // Blue b = (Blue) r;
        Blue lb = new Blue();
        Color clBl = lb;
        Red rdBl = (Red) clBl;



    }
}
