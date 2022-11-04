package org.example.designpatterns.structuraldesignpatterns.compositepattern.demo.transparent.course;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Course extends CourseComponent {
    private String name;
    private Double price;

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name + ": ¥" + price);
    }
}
