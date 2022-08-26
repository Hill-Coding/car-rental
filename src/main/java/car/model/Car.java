package car.model;

import java.math.BigDecimal;

public class Car {
    private String brand;
    private String model;
    private Engine engine;
    private EngineType engineType;
    private Gearbox gearbox;
    private BigDecimal basePrice;
    private String vin;
    private String productionYear;
    private CarType carType;
    private CarSegment carSegment;
    private int seats;
    private boolean availability;

    public Car(String brand, String model, Engine engine, EngineType engineType, Gearbox gearbox, BigDecimal basePrice,
               String vin, String productionYear, CarType carType, CarSegment carSegment, int seats, boolean availability) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.engineType = engineType;
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

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
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

    //Fixme was equals and hashCode was generated based only on vin number, is it correct?
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
                ", engineType=" + engineType +
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

    public static class Engine {
        private double capacity;
        private int power;

        public Engine(double capacity, int power) {
            this.capacity = capacity;
            this.power = power;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "capacity=" + capacity +
                    ", power=" + power +
                    '}';
        }
    }
}
