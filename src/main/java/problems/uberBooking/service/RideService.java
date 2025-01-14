package problems.uberBooking.service;

import problems.uberBooking.repository.entities.Ride;

import java.awt.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RideService {

    private static RideService instance;
    private final ConcurrentMap<String, Ride> rideRequests;

    private RideService() {
        rideRequests = new ConcurrentHashMap<>();
    }

    public static RideService getInstance() {
        if (instance == null) {
            synchronized (RideService.class) {
                if (instance == null) {
                    instance = new RideService();
                }
            }
        }
        return instance;
    }

    public void addRideRequest(Ride ride) {
        if (ride.getStatus().equals("InProgress")) {
            System.out.println("User already has an active ride. Complete the current ride before starting a new one.");
        }
        else {
            rideRequests.put(ride.getId(), ride);
            System.out.println("Ride added: " + ride.getId());
        }
    }

    public void startRide(String rideId) {
        Ride ride = rideRequests.get(rideId);
        if (ride != null) {
            ride.setStatus("InProgress");
            System.out.println("Ride started: " + ride.getId());
        } else {
            System.out.println("Ride already there");
        }
    }

    public void completeRide(String rideId) {
        Ride ride = rideRequests.get(rideId);
        if (ride != null) {
            ride.setStatus("Completed");
            System.out.println("Ride completed: " + ride.getId());
        } else {
            System.out.println("Ride not found!");
        }
    }

}
