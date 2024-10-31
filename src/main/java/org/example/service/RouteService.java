package org.example.service;

//import org.example.publictransport.model.Route;
//import org.example.publictransport.repository.RouteRepository;

import org.example.publictransport.Route;
import org.example.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Route getRouteById(Integer id) {
        return routeRepository.findById(id).orElse(null);
    }

    public void deleteRoute(Integer id) {
        routeRepository.deleteById(id);
    }
}
