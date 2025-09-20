package day19.exercise2;

public class HumiditySensorImpl implements Sensor{

    private String location;

    public HumiditySensorImpl(String location) {
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
        return 55.0;
    }

    @Override
    public String getSensorDetails() {
        return "Humidity Sensor located in: " + this.location;
    }
}
