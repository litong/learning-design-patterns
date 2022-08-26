package org.example.designpatterns.creationaldesignpatterns.builderpattern.version2;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
public class CourseBuilder implements IBuilder {

    private Course course = new Course();

    public void addName(String name) {
        course.setName(name);
    }

    public void addPpt(String ppt) {
        course.setPpt(ppt);
    }

    public void addVideo(String video) {
        course.setVideo(video);
    }

    public void addNote(String note) {
        course.setNote(note);
    }

    public void addHomework(String homework) {
        course.setHomework(homework);
    }

    @Override
    public Course builder() {
        return course;
    }
}
