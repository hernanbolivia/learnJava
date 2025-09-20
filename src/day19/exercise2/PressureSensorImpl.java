package day19.exercise2;

public class PressureSensorImpl implements Sensor{

    private String location;

    public PressureSensorImpl(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public double readValue() {
        return 101.00;
    }

    @Override
    public String getSensorDetails() {
        return "Pressure Sensor located in: " + this.location;
    }
}
