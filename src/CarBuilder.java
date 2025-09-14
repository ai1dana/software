public interface CarBuilder {
    void setModel();
    void setSeats();
    void setEngine();
    void setGPS();
    void setTripComputer();
    Car build();
}

