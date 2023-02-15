package com.example.homework_3;

public class RetireeTicket extends  Ticket {

     private float ticketDiscount;

    public RetireeTicket (float ticketPrice , int numberOfTickets , float ticketDiscount){
        super(ticketPrice , numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }


    public RetireeTicket (float price, String deliveryPoint, String deliveryTime, int distance, String departureTime, String departurePoint) {
        super(price, deliveryPoint, deliveryTime, distance, departureTime, departurePoint);
    }
    public float countTicketPrice(){
        return (getPrice() * getNumberOfTickets() * (100 - ticketDiscount) / 100);
    }
}
