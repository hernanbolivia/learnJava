package day20.examplecomposition2;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel Core i5");
        Memory memory = new Memory(16);

        Computer computer = new Computer(processor, memory);

        computer.displayDetails();
    }
}
