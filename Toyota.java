public class Toyota extends Car {

    public Toyota(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " stops.");
    }

    @Override
    public void drive() {
        System.out.println(brand + " drives reliably.");
    }

    @Override
    public String fuelType() {
        return "Gasoline";
    }
}