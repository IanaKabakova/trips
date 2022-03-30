package com.example.trips;

import java.time.LocalDateTime;

public class Trip {

    final long id;

    final LocalDateTime startTime;
    final LocalDateTime endTime;
    final String startDestination;
    final String finalDestination;
    final LocalDateTime dateCreated;
    final String ownerEmail;

    public Trip(long id, LocalDateTime startTime, LocalDateTime endTime, String startDestination, String finalDestination, LocalDateTime dateCreated, String ownerEmail) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startDestination = startDestination;
        this.finalDestination = finalDestination;
        this.dateCreated = dateCreated;
        this.ownerEmail = ownerEmail;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getStartDestination() {
        return startDestination;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }
}
