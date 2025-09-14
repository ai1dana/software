public class SportCarBuilder implements CarBuilder {
    private Car car = new Car();

    public void setModel() { car.setModel("SportCar"); }
    public void setSeats() { car.setSeats(2); }
    public void setEngine() { car.setEngine("V8 Turbo"); }
    public void setGPS() { car.setGPS(true); }
    public void setTripComputer() { car.setTripComputer(true); }

    public Car build() { return car; }
}

