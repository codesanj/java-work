// Abstract class
abstract class Student {
    int rollNo;
    String regNo;

    public Student(int rollNo, String regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    // Abstract method
    public abstract void course();
}

// Subclass
class Kiitian extends Student {
    public Kiitian(int rollNo, String regNo) {
        super(rollNo, regNo);
    }

    // Implementation of abstract method
    public void course() {
        System.out.println("Enrolled in KIIT University");
    }
}

public class lab61 {
    public static void main(String[] args) {
        Kiitian student1 = new Kiitian(101, "KIIT101");
        student1.course();
    }
}