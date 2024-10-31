package org.example.repository;

//import org.example.publictransport.model.Route;

import org.example.publictransport.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Integer> {
}
