package org.example.publictransport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayments;
    private int userId;
    private int ticketId;
    private float amount;
    private String Paymentscol;
    private String paymentMethod;
    private String status;
    private Date date;

    // Геттеры и сеттеры
}
