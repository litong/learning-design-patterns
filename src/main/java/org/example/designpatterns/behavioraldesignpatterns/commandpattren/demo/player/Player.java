package org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class Player {
    public void play() {
        System.out.println("正常播放");
    }

    public void speed() {
        System.out.println("拖动进度条");
    }

    public void stop() {
        System.out.println("停止播放");
    }

    public void pause() {
        System.out.println("暂停播放");
    }
}
