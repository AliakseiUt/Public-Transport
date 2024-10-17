package org.example.publictransport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Table(name = "Tickets")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
