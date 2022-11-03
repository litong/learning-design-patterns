package org.example.designpatterns.structuraldesignpatterns.flyweightpattern.ticket;

/**
 * @author : litong
 * @since : 11/3/22, Thu
 **/
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("南京", "太原");
        ticket.showInfo("硬卧");
        ticket = TicketFactory.queryTicket("南京", "太原");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("南京南", "太原");
        ticket.showInfo("硬卧");
    }
}
