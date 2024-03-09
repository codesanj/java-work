// Interface
interface Employee {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

// Manager class using the Employee interface without implementing bonus()
class Manager implements Employee {
    @Override
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic); // basic + DA + HRA
    }

    @Override
    public double deductions(double basic) {
        return 0.12 * basic; // PF
    }
}

// Substaff class extending Manager and implementing bonus()
class Substaff extends Manager {
    @Override
    public double bonus(double basic) {
        return 0.5 * basic; // 50% of basic
    }
}

public class lab63 {
    public static void main(String[] args) {
        double basicSalary = 10000; // You can take input from the user

        Substaff substaff = new Substaff();

        double totalEarnings = substaff.earnings(basicSalary);
        double totalDeductions = substaff.deductions(basicSalary);
        double totalBonus = substaff.bonus(basicSalary);

        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Total Bonus: " + totalBonus);
}
}
