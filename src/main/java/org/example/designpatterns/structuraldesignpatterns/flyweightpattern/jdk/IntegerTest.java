package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.jdk;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        Integer e = Integer.valueOf(128);
        Integer f = 128;

        Integer g = Integer.valueOf(127);
        Integer h = 127;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(g == h);

    }
}
