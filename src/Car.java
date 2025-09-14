public class Car {
    private String model;
    private int seats;
    private String engine;
    private boolean hasGPS;
    private boolean hasTripComputer;

    public void setModel(String model) { this.model = model; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setGPS(boolean hasGPS) { this.hasGPS = hasGPS; }
    public void setTripComputer(boolean hasTripComputer) { this.hasTripComputer = hasTripComputer; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", seats=" + seats +
                ", engine='" + engine + '\'' +
                ", hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                '}';
    }
}
