package car.model;

public class Engine {
    private int power;
    private double displacement;
    private EngineType engineType;

    public Engine(int power, double displacement, EngineType engineType) {
        this.power = power;
        this.displacement = displacement;
        this.engineType = engineType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public enum EngineType {
        DIESEL, PETROL, GAS, ELECTRIC, HYBRID
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", displacement=" + displacement +
                ", engineType=" + engineType +
                '}';
    }
}
