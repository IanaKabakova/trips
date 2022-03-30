package com.example.trips;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource()
public interface TripRepository extends MongoRepository<Trip, Long> {

    public List<Trip> findAll();
    public Optional<Trip> findById(long id);

    public Trip save(Trip trip);

    public void deleteById(long id);
}
