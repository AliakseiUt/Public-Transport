package org.example.publictransport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRoutes;
    private String startPoint;
    private String endPoint;
    private String transportType;
    private int scheduleId;

    // Геттеры и сеттеры
}
