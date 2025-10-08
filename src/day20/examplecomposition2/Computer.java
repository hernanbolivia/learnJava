package day20.examplecomposition2;

/**
 * Composition - Relation: "has a" Memory and a Processor.
 */
public class Computer {

    private Processor processor;
    private Memory memory;

    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void displayDetails() {
        System.out.println("\n====Details of Computer====");
        System.out.printf("%-15s: %s%n", "Processor", this.processor.getModel());
        System.out.printf("%-15s: %d GB%n", "Memory",this.memory.getCapacity());

    }
}
