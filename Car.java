package Home2;

class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, String year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель автомобиля остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Автомобиль ускоряется до " + speed + " км/ч.");
    }

    @Override
    public void brake() {
        System.out.println("Автомобиль остановился.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Автомобиль: " + getBrand() + " " + getModel() + " (" + getYear() + ")");
        System.out.println("Топливный бак: " + fuelCapacity + " л");
        System.out.println("Уровень топлива: " + currentFuelLevel + " л");
    }

    public void refuel(int liters) {
        currentFuelLevel += liters;
        System.out.println("Автомобиль заправлен на " + liters + " литров.");
    }
}
