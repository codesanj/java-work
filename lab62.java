// Interface
interface Motor {
    int capacity = 5; // Data member

    void run(); // Method
    void consume(); // Method
}

// Class implementing the interface
class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine is running");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power");
    }
}

public class lab62 {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        System.out.println("Capacity of the washing machine: " + Motor.capacity);
 }
}
