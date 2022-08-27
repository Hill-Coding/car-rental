package car.model;

import java.math.BigDecimal;

public class Car {
    private String brand;
    private String model;
    private Engine engine;
    private Gearbox gearbox;
    private BigDecimal basePrice;
    private String vin;
    // fixme change to java.time.year
    private String productionYear;
    private CarType carType;
    private CarSegment carSegment;
    private int seats;
    private boolean availability;

    public Car(String brand, String model, Engine engine, Gearbox gearbox, BigDecimal basePrice,
               String vin, String productionYear, CarType carType, CarSegment carSegment, int seats, boolean availability) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.gearbox = gearbox;
        this.basePrice = basePrice;
        this.vin = vin;
        this.productionYear = productionYear;
        this.carType = carType;
        this.carSegment = carSegment;
        this.seats = seats;
        this.availability = availability;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarSegment getCarSegment() {
        return carSegment;
    }

    public void setCarSegment(CarSegment carSegment) {
        this.carSegment = carSegment;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return vin != null ? vin.equals(car.vin) : car.vin == null;
    }

    @Override
    public int hashCode() {
        return vin != null ? vin.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", gearbox=" + gearbox +
                ", basePrice=" + basePrice +
                ", vin='" + vin + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", carType=" + carType +
                ", carSegment=" + carSegment +
                ", seats=" + seats +
                ", availability=" + availability +
                '}';
    }
}
