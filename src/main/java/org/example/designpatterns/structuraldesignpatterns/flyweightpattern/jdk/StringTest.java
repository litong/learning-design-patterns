package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.jdk;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s9);
    }
}
