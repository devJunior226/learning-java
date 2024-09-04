package declarerClassJava.exercise;

public class Employee {
    String nom;
    int age;
    String designation;
    double salary;

    // Constructor
    public Employee(String nom) {
        this.nom = nom;
    }

    // Assigning value
    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // printing the employee details
    public void employeeDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
