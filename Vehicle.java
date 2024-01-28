package Home2;

public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private String year;

    public Vehicle(int id, String brand, String model, String year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate(int speed);
    public abstract void brake();
    public abstract void displayInfo();

    // Геттеры и сеттеры для свойств

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}


