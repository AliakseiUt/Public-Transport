package org.example.repository;

//import org.example.publictransport.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.RouteMatcher;

public interface RouteRepository extends JpaRepository<RouteMatcher.Route, Integer> {
}
