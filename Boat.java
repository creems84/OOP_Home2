package Home2;

class Boat extends Vehicle implements Swimmable {
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int id, String brand, String model, String year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель лодки запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель лодки остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Лодка набирает скорость " + speed + " узлов.");
    }

    @Override
    public void brake() {
        System.out.println("Лодка прекратила движение.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Лодка: " + getBrand() + " " + getModel() + " (" + getYear() + ")");
        System.out.println("Максимальная скорость на воде: " + maxSpeed + " узлов");
        System.out.println("Состояние движения по воде: " + (isSailing ? "движется" : "стоит на месте"));
    }

    @Override
    public void startSwimming() {
        if (!isSailing) {
            System.out.println("Лодка начинает движение по воде.");
            isSailing = true;
        } else {
            System.out.println("Лодка уже движется по воде.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSailing) {
            System.out.println("Лодка прекращает движение по воде.");
            isSailing = false;
        } else {
            System.out.println("Лодка уже стоит на месте.");
        }
    }
}
