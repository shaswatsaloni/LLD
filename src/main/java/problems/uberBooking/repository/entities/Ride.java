package problems.uberBooking.repository.entities;

public class Ride {
    private String id;
    private Long dateTime;
    private String userId;
    private Location pickupAddress;
    private Location dropAddress;
    private String vehicleId;
    private Double expectedFare;
    private Double duration;
    private String status;
    private Double actualFare;
    private Integer distance;
    private String driverId;
    private Integer rating;

    private Ride(RideBuilder builder) {
        this.id = builder.id;
        this.dateTime = builder.dateTime;
        this.userId = builder.userId;
        this.pickupAddress = builder.pickupAddress;
        this.dropAddress = builder.dropAddress;
        this.vehicleId = builder.vehicleId;
        this.expectedFare = builder.expectedFare;
        this.duration = builder.duration;
        this.status = builder.status;
        this.actualFare = builder.actualFare;
        this.distance = builder.distance;
        this.driverId = builder.driverId;
        this.rating = builder.rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static RideBuilder getBuilder() {
        return new RideBuilder();
    }

    public String getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public static class RideBuilder {
        private String id;
        private Long dateTime;
        private String userId;
        private Location pickupAddress;
        private Location dropAddress;
        private String vehicleId;
        private Double expectedFare;
        private Double duration;
        private String status;
        private Double actualFare;
        private Integer distance;
        private String driverId;
        private Integer rating;


        public RideBuilder() {
        }

        public RideBuilder id(String Id) {
            this.id = Id;
            return this;
        }

        public RideBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public RideBuilder pickupAddress(Location pickupAddress) {
            this.pickupAddress = pickupAddress;
            return this;
        }

        public RideBuilder dropAddress(Location dropAddress) {
            this.dropAddress = dropAddress;
            return this;
        }

        public RideBuilder dateTime(Long dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public RideBuilder vehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }


        public RideBuilder expectedFare(Double expectedFare) {
            this.expectedFare = expectedFare;
            return this;
        }

        public RideBuilder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        public RideBuilder status(String status) {
            this.status = status;
            return this;
        }

        public RideBuilder actualFare(Double actualFare) {
            this.actualFare = actualFare;
            return this;
        }

        public RideBuilder distance(Integer distance) {
            this.distance = distance;
            return this;
        }

        public RideBuilder driverId(String driverId) {
            this.driverId = driverId;
            return this;
        }

        public RideBuilder rating(Integer rating) {
            this.rating = rating;
            return this;
        }

        public Ride build() {
            return new Ride(this);
        }

        public String getId() {
            return id;
        }

        public Long getDateTime() {
            return dateTime;
        }

        public String getUserId() {
            return userId;
        }

        public Location getPickupAddress() {
            return pickupAddress;
        }

        public Location getDropAddress() {
            return dropAddress;
        }
    }


}
