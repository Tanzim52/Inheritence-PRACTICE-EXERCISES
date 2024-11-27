// Person superclass
public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}

// Student subclass
public class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}

// Instructor subclass
public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}

// Test Program
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Alice", 1980);
        Student s = new Student("Bob", 1995, "Computer Science");
        Instructor i = new Instructor("Charlie", 1970, 90000);

        System.out.println(p);
        System.out.println(s);
        System.out.println(i);
    }
}
