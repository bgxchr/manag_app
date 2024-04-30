package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeManagSystem employeeManagementSystem = new EmployeeManagSystem();

        employeeManagementSystem.addEmployee(new Employee(1, "John Doe", "IT", 50000));
        employeeManagementSystem.addEmployee(new Employee(2, "Jane Doe", "HR", 55000));

        employeeManagementSystem.viewAllEmployees();

        Employee employee = employeeManagementSystem.viewEmployeeById(1);
        System.out.println(employee);

        Employee updatedEmployee = new Employee(1, "John Doe", "IT", 55000);
        employeeManagementSystem.updateEmployee(updatedEmployee);

        employee = employeeManagementSystem.viewEmployeeById(1);
        System.out.println(employee);

        employeeManagementSystem.deleteEmployee(2);

        employeeManagementSystem.viewAllEmployees();
    }
}
