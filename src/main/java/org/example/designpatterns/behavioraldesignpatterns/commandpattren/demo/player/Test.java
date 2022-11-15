package org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player;

import org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.actions.PauseAction;
import org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.actions.PlayAction;
import org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.actions.SpeedAction;
import org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.actions.StopAction;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        PauseAction pauseAction = new PauseAction(player);
        PlayAction playAction = new PlayAction(player);
        StopAction stopAction = new StopAction(player);
        SpeedAction speedAction = new SpeedAction(player);


        controller.addAction(playAction);
        controller.addAction(pauseAction);
        controller.addAction(stopAction);
        controller.addAction(speedAction);

        controller.execute();

    }
}
