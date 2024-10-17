package org.example.publictransport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "Tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTickets;
    private int userId;
    private int routeId;
    private Date purchase;
    private String qrCode;
    private String status;

    // Геттеры и сеттеры
}
