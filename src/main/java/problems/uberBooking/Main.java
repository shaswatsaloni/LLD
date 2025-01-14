package problems.uberBooking;

import problems.uberBooking.repository.entities.Location;
import problems.uberBooking.repository.entities.Ride;
import problems.uberBooking.service.RideService;
import problems.uberBooking.common.VehicleType;
import problems.uberBooking.common.UserType;

import java.time.Instant;

public class Main {
    public static void main(String[] args){
        RideService rideService = RideService.getInstance();

        Location source = new Location(129716, 77.5946, 67.3633, "Vaishali");
        Location destination = new Location(129611, 77.6011, 871.233, "gwalior");

        Ride ride = Ride.getBuilder()
                .id("1")
                .userId("user1")
                .pickupAddress(source)
                .dropAddress(destination)
                .dateTime(34642674L)
                .vehicleId("Vehicle123")
                .expectedFare(250.0)
                .duration(30.0) // in minutes
                .distance(10) // in kilometers
                .driverId("Driver567")
                .rating(5) // initial rating
                .status("Requested")
                .build();
        //System.out.print("Hello");

        rideService.addRideRequest(ride);
        rideService.startRide(ride.getId());
        rideService.addRideRequest(ride);
        rideService.completeRide(ride.getId());

    }
}
