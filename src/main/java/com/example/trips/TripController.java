package com.example.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {

    private TripService service;

    public TripController(@Autowired TripService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Trip> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Trip find(@PathVariable long id) {
        return service.find(id);
    }

    @PostMapping()
    public void create(@RequestBody Trip trip) {
        service.create(trip);
    }

    @PutMapping("/{id}")
    public Trip update(@PathVariable long id, @RequestBody Trip trip) {
        return service.update(id, trip);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}
