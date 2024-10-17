package org.example.publictransport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "Schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSchedules;
    private int routeId;
    private Date departureTime;
    private Date arrivalTime;
    private String frequency;

    // Геттеры и сеттеры
}
