public class FamilyCarBuilder implements CarBuilder {
    private Car car = new Car();

    public void setModel() { car.setModel("FamilyCar"); }
    public void setSeats() { car.setSeats(5); }
    public void setEngine() { car.setEngine("Hybrid 2.0"); }
    public void setGPS() { car.setGPS(true); }
    public void setTripComputer() { car.setTripComputer(false); }

    public Car build() { return car; }
}

