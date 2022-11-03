package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.ticket;

import java.util.Random;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;

    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(5000);
        System.out.println(from + "->" + to + ":" + bunk + "价格: " + price);
    }
}
