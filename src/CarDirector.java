public class CarDirector {
    public Car construct(CarBuilder builder) {
        builder.setModel();
        builder.setSeats();
        builder.setEngine();
        builder.setGPS();
        builder.setTripComputer();
        return builder.build();
    }
}

