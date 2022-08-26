package org.example.designpatterns.creationaldesignpatterns.builderpattern.version3;

import lombok.Data;

/**
 * @author : litong
 * @since : 8/26/22, Fri
 **/
@Data
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;

    private String homework;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }
}
