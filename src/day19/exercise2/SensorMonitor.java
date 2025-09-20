package day19.exercise2;

public class SensorMonitor {

    /**
     * Service responsible for monitoring generic sensors.
     */

    public void displayReading(Sensor sensor){

        System.out.printf("%-35s%n", sensor.getSensorDetails());
        System.out.printf("%-29s: %.2f%n", "Read value", sensor.readValue());
        System.out.println("-----------------------------------");


    }


}
