// Abstract class
abstract class Employee {
    abstract void calculateSalary();
    abstract void displayInfo();
}

// Manager subclass
class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: 500000");
    }

    @Override
    void displayInfo() {
        System.out.println("Manager: aditi mam");
    }
}

// Programmer subclass
class Programmer extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Programmer Salary: 30000");
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer: ajit");
    }
}

// Main class
public class Employee1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();

        m.displayInfo();
        m.calculateSalary();

        System.out.println();

        p.displayInfo();
        p.calculateSalary();
    }
}
