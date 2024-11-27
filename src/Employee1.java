// Employee class
public class Employee1 {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: $" + salary;
    }
}

// Manager class
public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

// Executive class
public class Executive extends Manager {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return super.toString() + " (Executive)";
    }
}

// Test Program
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 50000);
        Manager m = new Manager("Bob", 70000, "IT");
        Executive ex = new Executive("Charlie", 100000, "Finance");

        System.out.println(e);
        System.out.println(m);
        System.out.println(ex);
    }
}
