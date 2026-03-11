package com.example.flightmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
import com.example.flightmanagement.dto.FlightDTO;
import com.example.flightmanagement.model.Flight;
import com.example.flightmanagement.service.FlightService;
 
@Controller
public class FlightController {
 
    @Autowired
    private FlightService flightService;
 
    @GetMapping("/addFlight")
    public String addFlightPage(Model model) {
        model.addAttribute("flight", new FlightDTO());
        return "addFlight";
    }
 
    @PostMapping("/saveFlight")
    public String saveFlight(@ModelAttribute FlightDTO flightDTO) {
        flightService.addFlight(flightDTO);
        return "redirect:/viewFlights";
    }
 
    @GetMapping("/viewFlights")
    public String viewFlights(Model model) {
        List<Flight> flights = flightService.viewFlights();
        model.addAttribute("flights", flights);
        return "viewFlights";
    }
 
    @GetMapping("/updateFlight/{id}")
    public String updateFlightPage(@PathVariable Long id, Model model) {
        Flight flight = flightService.getFlight(id);
        model.addAttribute("flight", flight);
        return "updateFlight";
    }
 
    @PostMapping("/updateFlight")
    public String updateFlight(@ModelAttribute Flight flight) {
        flightService.updateFlight(flight.getFlightId(), flight);
        return "redirect:/viewFlights";
    }
 
    @GetMapping("/deleteFlight/{id}")
    public String deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
        return "redirect:/viewFlights";
    }
}