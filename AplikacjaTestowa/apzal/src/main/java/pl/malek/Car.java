package pl.malek;

public class Car {
    private String registrationNumber;
    private String brand;

    public Car(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public String getInfo() {
        return registrationNumber + " - " + brand;
    }
}

