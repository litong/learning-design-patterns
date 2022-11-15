package org.example.designpatterns.behavioraldesignpatterns.commandpattren.demo.player;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : litong
 * @since : 11/15/22, Tue
 **/
public class Controller {

    private List<IAction> actions = new ArrayList<>();

    public void addAction(IAction action) {
        actions.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void execute() {
        for (IAction action : actions) {
            action.execute();
        }

    }
}
