import java.util.Scanner;

// Parent class Employee
class Employee {
    String name;
    String department;
    int id;
    double basicSalary;

    // Constructor
    public Employee(String name, String department, int id, double basicSalary) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Method to calculate earnings
    public double calculateEarnings() {
        double da = 0.4 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }

    // Method to calculate deductions
    public double calculateDeductions() {
        return 0.12 * basicSalary;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return 0.20 * basicSalary;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        return calculateEarnings() - calculateDeductions() + calculateBonus();
    }

    // Method to print salary slip
    public void printSalarySlip() {
        System.out.println("Salary Slip:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Earnings: $" + calculateEarnings());
        System.out.println("Deductions: $" + calculateDeductions());
        System.out.println("Bonus: $" + calculateBonus());
        System.out.println("Net Salary: $" + calculateNetSalary());
    }
}

// Child class TechnicalEmployee
class TechnicalEmployee extends Employee {
    // Constructor
    public TechnicalEmployee(String name, String department, int id, double basicSalary) {
       super(name, department, id, basicSalary);
    }

    // Overriding the calculateEarnings method
    @Override
    public double calculateEarnings() {
        double da = 0.4 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }

    // Overriding the calculateDeductions method
    @Override
    public double calculateDeductions() {
        return 0.12 * basicSalary;
    }

    // Overriding the calculateBonus method
    @Override
    public double calculateBonus() {
        return 0.20 * basicSalary;
    }
}

// Child class NonTechnicalEmployee
class NonTechnicalEmployee extends Employee {
    // Constructor
    public NonTechnicalEmployee(String name, String department, int id, double basicSalary) {
       super(name, department, id, basicSalary);
    }

    // Overriding the calculateEarnings method
    @Override
    public double calculateEarnings() {
        double da = 0.4 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }

    // Overriding the calculateDeductions method
    @Override
    public double calculateDeductions() {
        return 0.12 * basicSalary;
    }

    // Overriding the calculateBonus method
    @Override
    public double calculateBonus() {
        return 0.20 * basicSalary;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input employee details
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter department:");
        String department = scanner.nextLine();
        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter basic salary:");
        double basicSalary = scanner.nextDouble();
        
        // Create TechnicalEmployee object
        TechnicalEmployee technicalEmployee = new TechnicalEmployee(name, department, id, basicSalary);
        // Print salary slip for technical employee
        technicalEmployee.printSalarySlip();
        
        // Create NonTechnicalEmployee object
        NonTechnicalEmployee nonTechnicalEmployee = new NonTechnicalEmployee(name, department, id, basicSalary);
        // Print salary slip for non-technical employee
        nonTechnicalEmployee.printSalarySlip();
    }
}
