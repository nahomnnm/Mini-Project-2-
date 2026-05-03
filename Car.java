public class Car extends Vehicle {

    protected int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed); // super() constructor call
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Doors: " + doors);
    }

    public static void category() { 
        System.out.println("Car Category");
    }
}