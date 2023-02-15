package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView ticketRetireeOut;
    private TextView ticketOut;
    private TextView ticketChildOut;
    private TextView ticketTotalOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ticket ticket = new Ticket(70, 9);

        Ticket ChildTickets = new ChildTicket(70 , 11 , 50);

        Ticket RetireeTickets = new RetireeTicket(70 ,5 , 30);

        ChildTickets.countTicketPrice();

        ticketOut = findViewById(R.id.ticketOut);
        ticketChildOut = findViewById(R.id.ticketChildOut);
        ticketTotalOut = findViewById(R.id.ticketToralOut);
        ticketRetireeOut = findViewById(R.id.ticketRetireeOut);

        float overallPrice = ticket.countTicketPrice();
        float overallChildPrice = ChildTickets.countTicketPrice();
        float overallRetireePrice = RetireeTickets.countTicketPrice();


        ticketOut.setText(overallPrice + " монет ");
        ticketChildOut.setText(overallChildPrice + " монет ");
        ticketRetireeOut.setText(overallRetireePrice + " монет ");
        ticketTotalOut.setText((overallChildPrice + overallRetireePrice + overallPrice) + " монет ");







    }
}

