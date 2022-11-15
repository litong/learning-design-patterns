package org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.actions;

import org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.IAction;
import org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player.Player;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class PauseAction implements IAction {

    private final Player player;

    public PauseAction(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}
