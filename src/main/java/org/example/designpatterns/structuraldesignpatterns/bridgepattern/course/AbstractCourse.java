package org.example.designpatterns.structuraldesignpatterns.bridgepattern.course;

/**
 * @author : litong
 * @since : 11/2/22, Wed
 **/
public class AbstractCourse implements ICourse {
    private INote note;

    private IVideo video;

    public void setNote(INote note) {
        this.note = note;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "AbstractCourse{" +
                "note=" + note +
                ", video=" + video +
                '}';
    }
}
