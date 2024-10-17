package org.example.publictransport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoutes;
    private String startPoint;
    private String endPoint;
    private String transportType;
    private int scheduleId;

    // Геттеры и сеттеры
}
