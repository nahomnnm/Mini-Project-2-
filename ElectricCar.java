public class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(String brand, int speed, int doors, int batteryLevel) {
        super(brand, speed, doors);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}