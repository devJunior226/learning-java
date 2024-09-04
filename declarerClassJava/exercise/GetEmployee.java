package declarerClassJava.exercise;

public class GetEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James Smith");
        Employee employee2 = new Employee("John Smith");

        // Details for employee 1
        employee1.setAge(27);
        employee1.setSalary(1000);
        employee1.setDesignation("Java Developer");
        employee1.employeeDetails();

        System.out.println("------------------------");

        // Details for employee 2
        employee2.setAge(30);
        employee2.setSalary(2050);
        employee2.setDesignation("Cyber Security engineer");
        employee2.employeeDetails();
    }
}
