package day19.exercise2;

public class Main {
    public static void main(String[] args) {

        Sensor sensorTemp = new TemperatureSensorImpl("Server room");
        Sensor sensorHumidity = new HumiditySensorImpl("Living room");
        Sensor sensorPressure = new PressureSensorImpl("Kitchen");


        SensorMonitor monitor = new SensorMonitor();

        System.out.println("\n====== Display sensor reading ======\n");

        monitor.displayReading(sensorTemp);
        monitor.displayReading(sensorHumidity);
        monitor.displayReading(sensorPressure);


    }
}
