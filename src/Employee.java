// Employee class
public class Employee {
    private String name;
    private double baseSalary;

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBaseSalary(double newSalary) {
        this.baseSalary = newSalary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.baseSalary;
    }
}

// Manager class
public class Manager extends Employee {
    private double bonus;

    public Manager() {
        this.bonus = 0;
    }

    public Manager(String name, double baseSalary, double bonus) {
        setName(name);
        setBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}

// Test Program
public class ManagerTest {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 50000, 10000);
        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Salary: $" + mgr.getSalary());
    }
}
