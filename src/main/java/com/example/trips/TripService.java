package com.example.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    private TripRepository repo;

    public TripService(@Autowired TripRepository repo) {
        this.repo = repo;
    }

    public List<Trip> findAll() {
        return repo.findAll();
    }

    public Trip find(long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public void create(Trip trip) {
        repo.save(trip);
    }

    public Trip update(long id, Trip trip) {
        throw new RuntimeException("not implemented");
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
