package Home2;

// Класс Aircraft
class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;
    private boolean isFlying;

    public Aircraft(int id, String brand, String model, String year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель самолета остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Самолет набирает скорость " + speed + " км/ч.");
    }

    @Override
    public void brake() {
        System.out.println("Самолет прекратил движение.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Самолет: " + getBrand() + " " + getModel() + " (" + getYear() + ")");
        System.out.println("Максимальная высота полета: " + maxAltitude + " м");
        System.out.println("Состояние полета: " + (isFlying ? "в полете" : "на земле"));
    }

    @Override
    public void takeOff() {
        if (!isFlying) {
            System.out.println("Самолет взлетает.");
            isFlying = true;
        } else {
            System.out.println("Самолет уже в полете.");
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            System.out.println("Самолет совершает посадку.");
            isFlying = false;
        } else {
            System.out.println("Самолет уже на земле.");
        }
    }
}

