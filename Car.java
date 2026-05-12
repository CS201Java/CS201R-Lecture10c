public abstract class Car implements Vehicle {
    
    protected String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println(brand + " goes beep beep!");
    }

    // new abstract method
    public abstract String fuelType();

    public abstract void drive();
}