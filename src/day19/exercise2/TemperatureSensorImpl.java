package day19.exercise2;

public class TemperatureSensorImpl implements Sensor {

    private String location;

    public TemperatureSensorImpl(String location) {
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
        return 25.5;
    }

    @Override
    public String getSensorDetails() {
        return "Temperature Sensor located in: " + this.location;
    }
}
