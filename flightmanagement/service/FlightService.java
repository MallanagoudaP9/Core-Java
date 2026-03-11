package com.example.flightmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.flightmanagement.dto.FlightDTO;
import com.example.flightmanagement.model.Flight;
import com.example.flightmanagement.repository.FlightRepository;
 
@Service
public class FlightService {
 
    @Autowired
    private FlightRepository flightRepository;
 
    public void addFlight(FlightDTO dto) {
        Flight flight = new Flight();
        flight.setFlightNumber(dto.getFlightNumber());
        flight.setAirlineName(dto.getAirlineName());
        flight.setSource(dto.getSource());
        flight.setDestination(dto.getDestination());
        flight.setPrice(dto.getPrice());
 
        flightRepository.save(flight);
    }
 
    public List<Flight> viewFlights() {
        return flightRepository.findAll();
    }
 
    public void updateFlight(Long id, Flight flight) {
        Flight existing = flightRepository.findById(id).orElse(null);
 
        if(existing != null){
            existing.setAirlineName(flight.getAirlineName());
            existing.setSource(flight.getSource());
            existing.setDestination(flight.getDestination());
            existing.setPrice(flight.getPrice());
 
            flightRepository.save(existing);
        }
    }
 
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
 
    public Flight getFlight(Long id){
        return flightRepository.findById(id).orElse(null);
    }
}