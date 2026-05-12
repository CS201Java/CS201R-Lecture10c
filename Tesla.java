public class Tesla extends Car {

    public Tesla(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " starts silently.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " stops.");
    }

    @Override
    public void drive() {
        System.out.println(brand + " drives smoothly.");
    }

    @Override
    public String fuelType() {
        return "Electric";
    }
}