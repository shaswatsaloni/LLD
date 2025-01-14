package problems.uberBooking.repository.entities;

public class Location {
    private Integer zipCode;
    private Double latitude;
    private Double longitude;
    private String address;

    public Location (Integer zipCode, Double latitude, Double longitude, String address){
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
