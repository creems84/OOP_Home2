package Home2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Toyota", "Camry", "2022", 60);
        car.startEngine();
        car.accelerate(80);
        car.displayInfo();
        car.brake();
        car.stopEngine();
        car.refuel(10);
        car.displayInfo();

        System.out.println();

        Aircraft aircraft = new Aircraft(2, "Boeing", "747", "2000", 10000);
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.accelerate(500);
        aircraft.displayInfo();
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        System.out.println();

        Boat boat = new Boat(3, "Yamaha", "AR240", "2015", 40);
        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(20);
        boat.displayInfo();
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
    }
}
