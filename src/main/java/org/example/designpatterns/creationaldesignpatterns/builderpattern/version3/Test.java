package org.example.designpatterns.creationaldesignpatterns.builderpattern.version3;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("设计模式")
                .addPpt("设计模式课件")
                .addVideo("设计模式视频");

        System.out.println("builder.builder() = " + builder.builder());
    }
}
