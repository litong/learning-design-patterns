package org.example.designpatterns.structuraldesignpatterns.compositepattern.demo.transparent.course;

/**
 * @author : litong
 * @since : 11/4/22, Fri
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("========== 透明的组合模式 ==========");

        CourseComponent javaBase = new Course("Java 入门课程", 8280.0);
        CourseComponent ai = new Course("人工智能", 5000.0);

        CourseComponent packageCourse = new CoursePackage("Java 架构师课程", 2);

        CourseComponent design = new Course("Java 设计模式", 1500.0);

        CourseComponent source = new Course("源码分析", 2000.0);

        CourseComponent softSkill = new Course("软技能", 3000.0);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        CourseComponent catalog = new CoursePackage("总课程", 1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();
    }
}
