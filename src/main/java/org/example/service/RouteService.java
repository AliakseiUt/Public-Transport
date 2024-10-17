package org.example.service;

//import org.example.publictransport.model.Route;
//import org.example.publictransport.repository.RouteRepository;
import org.example.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.RouteMatcher;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public RouteMatcher.Route createRoute(RouteMatcher.Route route) {
        return routeRepository.save(route);
    }

    public List<RouteMatcher.Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public RouteMatcher.Route getRouteById(Integer id) {
        return routeRepository.findById(id).orElse(null);
    }

    public void deleteRoute(Integer id) {
        routeRepository.deleteById(id);
    }
}
