public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Generic", 60);
        v.displayInfo();
        v.startEngine();

        System.out.println();

        Car c = new Car("Toyota", 120, 4);
        c.displayInfo();
        c.startEngine();

        System.out.println();

        ElectricCar ec = new ElectricCar("Tesla", 150, 4, 90);
        ec.displayInfo();

        System.out.println();

        Bike b = new Bike("Yamaha", 80, true);
        b.displayInfo();

        System.out.println();

    
        Vehicle.category();
        Car.category();

        System.out.println();

        FinalVehicle fv = new FinalVehicle();
        fv.show();

    
    }
}