public class Bike extends Vehicle {

    private boolean hasCarrier;

    
    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Carrier: " + hasCarrier);
    }
}