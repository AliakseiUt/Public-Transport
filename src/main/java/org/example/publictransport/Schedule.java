package org.example.publictransport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Schedules")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
