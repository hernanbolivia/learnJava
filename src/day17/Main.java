package day17;

public class Main {
    public static void main(String[] args) {

        Employee fullTimeEmployee = new FullTimeEmployee(
                12,
                "Hernán",
                4500.00,
                45);

        Employee partTimeEmployee = new PartTimeEmployee(
                13,
                "Maddi",
                1500.00,
                80,
                10);

        fullTimeEmployee.displayDetails();
        partTimeEmployee.displayDetails();

    }
}
