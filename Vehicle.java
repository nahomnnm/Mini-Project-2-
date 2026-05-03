public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;   
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }

    public void startEngine() { 
        System.out.println("Engine started");
    }

    public static void category() {
        System.out.println("General Vehicle");
    }
}