public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        CarBuilder sportBuilder = new SportCarBuilder();
        CarBuilder familyBuilder = new FamilyCarBuilder();

        Car sportsCar = director.construct(sportBuilder);
        Car familyCar = director.construct(familyBuilder);

        System.out.println("=== Builder Pattern Demo ===");
        System.out.println("Sport Car: " + sportsCar);
        System.out.println("Family Car: " + familyCar);
    }
}
