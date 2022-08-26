package org.example.designpatterns.creationaldesignpatterns.builderpattern.version3;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class CourseBuilder implements IBuilder {

    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPpt(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    @Override
    public Course builder() {
        return course;
    }
}
